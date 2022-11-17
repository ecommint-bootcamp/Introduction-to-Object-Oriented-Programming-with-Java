package hw2.javaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class CalculatorConfig {
	
	@Bean
	public CalculatorT1 getCalculator1Function(int value) {
		
		return  new CalculatorT1(value);
	}
	
	
	@Bean
	public SinFunction getSinFunction() {
		
		return new SinFunction();
	}
	@Bean
	public LogFunction getLogFunction() {
		
		return new LogFunction();
	}
	@Bean
	public CosFunction getCosFunction() {
		
		return new CosFunction();
	}
	@Bean
	public FactorialFunction getFactorialFunction() {
		
		return new FactorialFunction();
	}
	@Bean
	public SquaredFunction getSquaredFunction() {
		
		return new SquaredFunction();
	}
	
	@Bean
	public int value() {
		return 3;
	}

}
