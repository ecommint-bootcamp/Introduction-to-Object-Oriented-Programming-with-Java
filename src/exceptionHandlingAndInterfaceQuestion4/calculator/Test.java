package exceptionHandlingAndInterfaceQuestion4.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	private static Scanner in;

	public static void main(String[] args) throws Exception {
		in = new Scanner(System.in);
		CalculatorT1 calculator1 = new CalculatorT1();
		calculator1.addFunction(new SinFunction());
		calculator1.addFunction(new CosFunction());
		calculator1.addFunction(new Square());
		calculator1.addFunction(new Cube());
		calculator1.addFunction(new SumFibonacci());
		startCalculator(calculator1);
	}

	private static void startCalculator(CalculatorT1 calculator) throws Exception {
		try {
			calculator.listMathFunction();
			System.out.println("Please enter the name of the function:");
			String functionName = in.next();
			if (functionName.equalsIgnoreCase("end"))
				System.exit(0);
			System.out.println("Please enter the argument of the function:");
			double functionArg = in.nextDouble();
			double result = calculator.doCalculation(functionName, functionArg);
			System.out.println(functionName + " of " + functionArg + " is " + result + "\n");

			startCalculator(calculator);
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid arguman.");
		} catch (Exception e) {
			System.out.println("an unexpected error occurred.");
		}
	}
}
