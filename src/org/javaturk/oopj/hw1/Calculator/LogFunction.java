package org.javaturk.oopj.hw1.Calculator;


public class LogFunction implements MathFunction {
	private static String name = "Log";

	public String getName() {
		return name;
	}

	public double calculate(double arg) {
		return Math.log(arg);
	}
}
