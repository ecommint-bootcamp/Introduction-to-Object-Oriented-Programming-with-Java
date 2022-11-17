package hw2.javaBasedConfiguration2;

import java.util.Scanner;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages ="hw2.javaBasedConfiguration2" )
public class Test {
	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
			 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
			 CalculatorT1 calculator2 = context.getBean(CalculatorT1.class);
			 System.out.println(calculator2);
			 context.close();
		

		startCalculator(calculator2);
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
