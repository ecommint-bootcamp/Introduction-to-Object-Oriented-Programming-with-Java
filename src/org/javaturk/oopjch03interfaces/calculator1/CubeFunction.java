package org.javaturk.oopjch03interfaces.calculator1;

public class CubeFunction implements MathFunction {
	
	private static String name = "Cube";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {
		return Math.pow(arg, 3);
	}

}
