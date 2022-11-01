package org.javaturk.oopj.hw1._03.arayuzler.hesapmakinesi;

public interface Calculator {

    void addFunction(MathFunction mathFunction);
    void listMathFunction();
    double doCalculation(String functionName,double value);
}
