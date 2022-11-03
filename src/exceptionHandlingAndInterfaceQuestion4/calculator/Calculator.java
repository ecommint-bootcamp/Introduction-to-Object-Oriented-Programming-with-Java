package exceptionHandlingAndInterfaceQuestion4.calculator;

public interface Calculator {
	public void addFunction(MathFunction mathFunction);

	public void listMathFunction();

	public double doCalculation(String name, double arg) throws Exception;
}
