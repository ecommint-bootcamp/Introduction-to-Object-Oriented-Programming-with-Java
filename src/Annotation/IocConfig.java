package Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class IocConfig {
    @Bean
    public CalculatorT1 calculatorT1() {
        final CalculatorT1 calculatorT1 = new CalculatorT1(5);
        MathFunction[] functions = { sinFunction(), cosFunction(),
                logFunction(), squaredFunction(), factorialFunction()};
        calculatorT1.setFunctions(functions);
        return calculatorT1;
    }

    @Bean
    public MathFunction sinFunction() {
        return new SinFunction();
    }

    @Bean
    public MathFunction cosFunction() {
        return new CosFunction();
    }

    @Bean
    public MathFunction logFunction() {
        return new LogFunction();
    }

    @Bean
    public MathFunction squaredFunction() {
        return new SquaredFunction();
    }

    @Bean
    public MathFunction factorialFunction() {
        return new FactorialFunction();
    }
}