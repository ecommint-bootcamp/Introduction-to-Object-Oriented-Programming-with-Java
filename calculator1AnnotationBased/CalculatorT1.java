public class CalculatorT1 implements Calculator{
	private int functionCount;
	private int currentCount = 0;
	private MathFunction[] functions;

	public CalculatorT1(int functionCount) {
		this.functionCount = functionCount;
		functions = new MathFunction[functionCount];
	}

	public void setFunctions(MathFunction[] functions) {
		this.functions = functions;
	}

	@Override
	public void addFunction(MathFunction function) {
		try {
			functions[currentCount] = function;
			currentCount++;
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Fonksiyon listesi dolu! "+ function.getName()+" eklenemedi.");
		}

	}

	@Override
	public double doCalculation(String functionName, double arg) {
		double result = 0.0;
		boolean isFunctionFound = false;
		for (MathFunction function : functions) {
			if (functionName.equalsIgnoreCase(function.getName())) {
				result = function.calculate(arg);
				isFunctionFound = true;
			}
		}
		if(!isFunctionFound)
			System.out.println("No such function found!");

		return result;
	}

	@Override
	public void listMathFunction() {
		System.out.println("Available Functions:");
		for (MathFunction function : functions)
			System.out.println(function.getName());
	}
}
