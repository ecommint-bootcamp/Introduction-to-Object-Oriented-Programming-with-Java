package exceptionHandlingAndInterfaceQuestion4.calculator;

public class Cube implements MathFunction {
	private static String name = "Cube";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) throws Exception {
		return Math.pow(arg, 3);
	}
}
