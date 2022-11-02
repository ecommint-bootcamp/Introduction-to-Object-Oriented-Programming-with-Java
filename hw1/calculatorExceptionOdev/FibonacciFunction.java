package hw1.calculatorExceptionOdev;

public class FibonacciFunction implements MathFunction {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Fibo";
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

	@Override
	public double calculate(double arg) {
		return calculateFibonacci(arg);
	}

	@Override
	public String toString() {
		return getName();
	}

}
