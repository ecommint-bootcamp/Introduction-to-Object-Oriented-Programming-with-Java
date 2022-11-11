package bekirgol_hw2.spring.withAnnotation;

public class LogFunction implements MathFunction {
	private static String name = "Log";

	public String getName() {
		return name;
	}

	public double calculate(double arg) {
		return Math.log(arg);
	}
}
