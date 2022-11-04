package org.javaturk.oopjch03interfaces.calculator1;

public class SquareFunction implements MathFunction {
	
	private static String name = "Square";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {
		return Math.pow(arg, 2);
	}

}
