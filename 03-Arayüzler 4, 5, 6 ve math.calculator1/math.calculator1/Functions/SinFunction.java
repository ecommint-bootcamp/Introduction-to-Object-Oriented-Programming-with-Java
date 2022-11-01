package org.javaturk.oofp.ch03.math.calculator1.Functions;

import org.javaturk.oofp.ch03.math.calculator1.MathFunction;

public class SinFunction implements MathFunction {
	
	private static String name = "Sin";

	public String getName() {
		return name;
	}
	
	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}
}
