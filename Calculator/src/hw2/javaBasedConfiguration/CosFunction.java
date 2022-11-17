package hw2.javaBasedConfiguration;

import org.springframework.stereotype.Component;


public class CosFunction implements MathFunction {

	private static String name = "Cos";

	public String getName() {
		return name;
	}

	public double calculate(double arg) {
		return Math.cos(arg);
	}
}
