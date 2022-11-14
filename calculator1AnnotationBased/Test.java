import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		CalculatorT1 calculator1 = context.getBean("calculator",CalculatorT1.class);
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
