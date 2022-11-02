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

		int fibo[] = new int[(int) (arg + 1)];
		fibo[0] = 0;
		fibo[1] = 1;

		int sum = fibo[0] + fibo[1];

		for (int i = 2; i <= arg; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			sum += fibo[i];
		}

		return sum;
	}

}
