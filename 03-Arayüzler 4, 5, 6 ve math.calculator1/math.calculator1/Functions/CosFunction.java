package org.javaturk.oofp.ch03.math.calculator1.Functions;

import org.javaturk.oofp.ch03.math.calculator1.MathFunction;

public class CosFunction implements MathFunction {

	private static String name = "Cos";

	public String getName() {
		return name;
	}
	
	public double calculate(double arg) {
		return Math.cos(arg);
	}
}
