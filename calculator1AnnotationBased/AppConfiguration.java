import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public CosFunction cosFunction(){
        return new CosFunction();
    }

    @Bean
    public SinFunction sinFunction(){
        return new SinFunction();
    }

    @Bean
    public LogFunction logFunction(){
        return new LogFunction();
    }

    @Bean
    public SquaredFunction squaredFunction(){
        return new SquaredFunction();
    }

    @Bean
    public FactorialFunction factorialFunction(){
        return new FactorialFunction();
    }

    @Bean(name = "calculator")
    public CalculatorT1 calculatorT1(){
        CalculatorT1 calculatorT1 = new CalculatorT1(5);
        calculatorT1.setFunctions(new MathFunction[]{cosFunction(),sinFunction(),logFunction(),factorialFunction(),squaredFunction()});
        return calculatorT1;
    }
}
