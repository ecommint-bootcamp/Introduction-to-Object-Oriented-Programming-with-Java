package hw2.annotationBasedConfiguration1;

public interface Calculator {

	public void addFunction(MathFunction function);

	public void listMathFunction();

	public double doCalculation(String functionName, double arg) throws Exception;

}