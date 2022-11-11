package bekirgol_hw2.spring.withXml;

public interface Calculator {
	public void setFunction(MathFunction[] mathFunctions);

	public void AddFunction(MathFunction function);

	public void listMathFunction();

	public double doCalculation(String functionName, double arg);

}
