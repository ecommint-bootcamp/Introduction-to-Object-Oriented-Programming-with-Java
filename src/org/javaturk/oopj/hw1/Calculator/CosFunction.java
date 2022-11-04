package org.javaturk.oopj.hw1.Calculator;

public class CosFunction implements MathFunction {

	private static String name = "Cos";

	public String getName() {
		return name;
	}
	
	public double calculate(double arg) {
		return Math.cos(arg);
	}
}
