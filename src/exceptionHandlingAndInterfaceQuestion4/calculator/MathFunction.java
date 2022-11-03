package exceptionHandlingAndInterfaceQuestion4.calculator;

public interface MathFunction {
	public String getName();

	public double calculate(double arg) throws Exception;
}
