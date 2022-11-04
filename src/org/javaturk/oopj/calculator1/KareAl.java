package org.javaturk.oofp.ch03.math.calculator1;
public class KareAl implements MathFunction {
	private static String name = "Kare";

	public String getName() {
		return name;
	}
	
	@Override
	public double calculate(double arg) {
		return arg*arg;
	}
}
