import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	private static Scanner in;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");
		CalculatorT1 calculator1 = context.getBean("calculatorT1",CalculatorT1.class);
		in = new Scanner(System.in);
		startCalculator(calculator1);
	}

	private static void startCalculator(CalculatorT1 calculator) {
		calculator.listMathFunction();
		
		System.out.println("Please enter the name of the function:");
		String functionName = in.next(); 
		if(functionName.equalsIgnoreCase("end"))
			System.exit(0);
		System.out.println("Please enter the argument of the function:");
		try {
			double functionArg = in.nextDouble();
			double result = calculator.doCalculation(functionName, functionArg);
			System.out.println(functionName + " of " + functionArg + " is " + result + "\n");
		}catch (InputMismatchException e){
			System.out.println("Girilen deger gecersiz.");
		}

		startCalculator(calculator);
	}
}
