package org.javaturk.oopj.hw1._03.arayuzler.hesapmakinesi;

import java.util.ArrayList;
import java.util.List;

public class CalculatorT1 implements Calculator{


    private List<MathFunction> mathFunctionList= new ArrayList<>();

    @Override
    public void addFunction(MathFunction mathFunction) {
        mathFunctionList.add(mathFunction);
    }

    @Override
    public void listMathFunction() {
        mathFunctionList.stream().forEach(System.out::println);
    }

    @Override
    public double doCalculation(String functionName, double value) {

        MathFunction mathFunction = mathFunctionList.stream().filter((function) -> functionName.equals(function.getName()))
                .findFirst().orElse(null);


        return mathFunction.calculate(value);
    }
}
