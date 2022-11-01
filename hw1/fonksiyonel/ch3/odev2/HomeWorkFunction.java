package hw1.fonksiyonel.ch3.odev2;

public class HomeWorkFunction implements MathFunction {
	private static String name = "Homework";

	@Override
	public String getName() {

		return name;
	}

	@Override
	public double calculate(double arg) {

		return calculateFibonacci(arg);
	}

	public double powSqrt(double arg) {
		return Math.sqrt(arg);
	}

	public double powThree(double arg) {
		return Math.pow(arg, 3);
	}

	public int calculateFibonacci(double arg) {
		if (arg <= 0)
			return 0;

		int fibon[] = new int[(int) (arg + 1)];
		fibon[0] = 0;
		fibon[1] = 1;
		int sum = fibon[0] + fibon[1];
		for (int i = 2; i < arg; i++) {
			fibon[i] = fibon[i - 1] + fibon[i - 2];
			sum += fibon[i];
		}
		return (int) sum;
	}

}
