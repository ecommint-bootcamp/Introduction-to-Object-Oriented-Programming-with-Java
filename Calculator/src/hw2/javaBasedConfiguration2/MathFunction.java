package hw2.javaBasedConfiguration2;

import org.springframework.stereotype.Component;


public interface MathFunction {

	public String getName();

	public double calculate(double arg) throws Exception;

}
