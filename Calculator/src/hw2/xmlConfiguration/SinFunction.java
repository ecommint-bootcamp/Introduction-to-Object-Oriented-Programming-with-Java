package hw2.xmlConfiguration;

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
