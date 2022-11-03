package exceptionHandlingAndInterfaceQuestion4.calculator;

public class Square implements MathFunction {
	private static String name = "Square";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) throws Exception {
		return Math.pow(arg, 2);
	}
}
