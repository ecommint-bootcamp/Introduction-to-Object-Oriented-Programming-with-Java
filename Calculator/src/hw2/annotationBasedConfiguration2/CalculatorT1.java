package hw2.annotationBasedConfiguration2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("calculator")
@PropertySource("classpath:calculator.properties")
public class CalculatorT1 implements Calculator {
	private int functionCount;
	private int currentCount = 0;

	private MathFunction[] functions;

	private double argument;

	
	public CalculatorT1(@Value("${value}") int functionCount) {
		this.functionCount = functionCount;
		functions = new MathFunction[functionCount];
	}	
	
	@Autowired
	public void setFunctions(MathFunction[] functions) {
		System.out.println("selam");
		this.functions = functions;
	}

	@Override
	public void addFunction(MathFunction function) {
		functions[currentCount] = function;
		currentCount++;
	}

//	public void doCalculation(MathFunction function, double arg) {
//		System.out.println(function.getName() + "(" + arg + ") = " + function.calculate(arg));
//	}

	@Override
	public double doCalculation(String functionName, double arg) throws Exception {

		double result = 0.0;
		boolean isFunctionFound = false;
		for (MathFunction function : functions) {
			if (functionName.equalsIgnoreCase(function.getName())) {
				result = function.calculate(arg);
				isFunctionFound = true;
			}
		}
		if (!isFunctionFound)
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
