package exceptionHandlingAndInterfaceQuestion4.calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorT1 implements Calculator {

	List<MathFunction> functions = new ArrayList<MathFunction>();

	@Override
	public void addFunction(MathFunction mathFunction) {
		functions.add(mathFunction);
	}

	@Override
	public void listMathFunction() {
		for (MathFunction function : functions) {
			System.out.println(function.getName());
		}
	}

	@Override
	public double doCalculation(String name, double arg) throws Exception {
		double result = 0.0;
		boolean isFunctionRound = false;

		for (MathFunction function : functions) {
			if (name.equalsIgnoreCase(function.getName())) {
				result = function.calculate(arg);
				isFunctionRound = true;
			}
		}

		if (!isFunctionRound) {
			System.out.println("No such function found!");
		}

		return result;

	}
}
