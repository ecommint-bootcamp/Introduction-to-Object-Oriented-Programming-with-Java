package hw2.annotationBasedConfiguration2;

import org.springframework.stereotype.Component;

@Component
public class CosFunction implements MathFunction {

	private static String name = "Cos";

	public String getName() {
		return name;
	}

	public double calculate(double arg) {
		return Math.cos(arg);
	}
}
