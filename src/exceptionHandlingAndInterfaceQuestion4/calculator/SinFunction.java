package exceptionHandlingAndInterfaceQuestion4.calculator;

public class SinFunction implements MathFunction {
	private static String name = "Sin";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) throws Exception {
		return Math.sin(arg);
	}

}
