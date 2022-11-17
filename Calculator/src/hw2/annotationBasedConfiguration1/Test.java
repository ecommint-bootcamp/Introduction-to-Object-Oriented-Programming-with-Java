package hw2.annotationBasedConfiguration1;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"hw2/annotationBasedConfiguration1/resources/applicationContext.xml");

		CalculatorT1 calculator1 = context.getBean("calculator", CalculatorT1.class);

		context.close();

	
		

		startCalculator(calculator1);
	}

	private static void startCalculator(CalculatorT1 calculator) {

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

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
