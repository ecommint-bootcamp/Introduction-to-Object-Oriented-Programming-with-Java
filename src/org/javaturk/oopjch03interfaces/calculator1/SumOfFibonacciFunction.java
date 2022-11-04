package org.javaturk.oopjch03interfaces.calculator1;

public class SumOfFibonacciFunction implements MathFunction {
	
	private static String name = "Fibonacci";

	@Override
	public String getName() {
		return name;
	}
	
	// Assumed that the Fibonacci series starts with 1

	@Override
	public double calculate(double arg) {
		
		int n1 = 0, n2 = 1, sum = 0, temp;
		
		for (int i = 2; i <= (int) arg; i++) {
			temp = n1 + n2;
			sum += temp;
			n1 = n2;
			n2 = temp;
		}
		
		return sum + 1;
	}

}
