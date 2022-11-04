package org.javaturk.oofp.ch03.math.calculator1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		try {
		CalculatorT1 calculator1 = new CalculatorT1(5);
		calculator1.addFunction(new LogFunction());
		calculator1.addFunction(new KareAl());
		calculator1.addFunction(new Cube());
		calculator1.addFunction(new FiboniacciFunction());
		calculator1.addFunction(new SquaredFunction());
		startCalculator(calculator1);
		}
		catch(NullPointerException hata){
			System.out.println("Eksik sayida fonksiyon girdiniz!!!");
		}
		catch(InputMismatchException hata2){
			System.out.println("sayi disinda terim girilemez!!!");
		}
		catch(ArrayIndexOutOfBoundsException hata3) {
			System.out.println("5 den fazla fonksiyon yazilamaz!!!");
		}
		
		
	
	}

	private static void startCalculator(CalculatorT1 calculator) {
		calculator.listMathFunction();
		
		System.out.println("Please enter the name of the function:");
		String functionName = in.next(); 
		if(functionName.equalsIgnoreCase("end"))
			System.exit(0);
		System.out.println("Please enter the argument of the function:");
		double functionArg = in.nextDouble(); 
		double result = calculator.doCalculation(functionName, functionArg);
		System.out.println(functionName + " of " + functionArg + " is " + result + "\n");
		
		startCalculator(calculator);
	}
}
