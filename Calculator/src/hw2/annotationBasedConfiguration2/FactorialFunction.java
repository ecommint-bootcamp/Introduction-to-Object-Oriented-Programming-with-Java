package hw2.annotationBasedConfiguration2;

public class FactorialFunction implements MathFunction {

	@Override
	public String getName() {
		return "Factorial";
	}

	@Override
	public double calculate(double arg) throws Exception {
		return calculateFactorial(arg);
	}

	private int calculateFactorial(double arg) throws Exception {
		if (arg < 0) {
			throw new Exception("Faktoriyel negatif girilemez");
		}

		int k = (int) arg;
		int factorial = 1;

		for (int i = 2; i <= k; i++) {
			factorial *= i;

		}
		return factorial;
	}

}
