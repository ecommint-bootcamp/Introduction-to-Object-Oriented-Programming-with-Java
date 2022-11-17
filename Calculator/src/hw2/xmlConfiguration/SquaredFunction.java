package hw2.xmlConfiguration;

public class SquaredFunction implements MathFunction {

	private static String name = "Squared";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg1) {
		return Math.sqrt(arg1);
	}
}
