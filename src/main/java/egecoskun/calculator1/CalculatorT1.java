package egecoskun.calculator1;


import egecoskun.degree.ThermalUnitNotRecognizedException;

public class CalculatorT1 implements Calculator{
	private int functionCount;
	private int currentCount = 0;
	
	private MathFunction[] functions;
	private double argument;

	public CalculatorT1(int functionCount) {
		this.functionCount = functionCount;
		functions = new MathFunction[functionCount];
	}

	@Override
	public void addFunction(MathFunction function) {
		functions[currentCount] = function;
		currentCount++;
	}



	@Override
	public double doCalculation(String functionName, double arg){
		double result = 0.0;
		for (MathFunction function : functions) {
			if (functionName.equalsIgnoreCase(function.getName())) {
				result = function.calculate(arg);

			}else{
				throw new FunctionNotFoundException();
			}
		}
		return result;
	}

	@Override
	public void listMathFunction() {
		System.out.println("Available Functions:");
		for (MathFunction function : functions)
			System.out.println(function.getName());
	}
}
