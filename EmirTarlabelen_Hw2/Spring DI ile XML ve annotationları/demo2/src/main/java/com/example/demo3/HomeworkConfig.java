package com.example.demo3;

import com.example.demo2.SinFunction;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HomeworkConfig {
    @Bean
    public CosFunction cosFunction(){
        CosFunction csf=new CosFunction();
        return csf;
    }
    @Bean
    public SinFunction sinFunction(){
        SinFunction arg=new SinFunction();
        return arg;
    }
    @Bean
    public LogFunction logFunction(){
        LogFunction lfc=new LogFunction();
        return lfc;
    }
    @Bean
    public Cube cube(){
        Cube cub=new Cube();
        return cub;
    }
    @Bean
    public KareAl kareAl(){
        KareAl kareAl=new KareAl();
        return kareAl;
    }
    @Bean
    public SquaredFunction squaredfunction(){
        SquaredFunction squaredFunction=new SquaredFunction();
        return squaredFunction;
    }
    @Bean
    public FiboniacciFunction fiboniacciFunction(){
        FiboniacciFunction fiboniacciFunction=new FiboniacciFunction();
        return fiboniacciFunction;
    }
    @Bean
    public FactorialFunction factorialFunction(){
        FactorialFunction factorialFunction=new FactorialFunction();
        return factorialFunction;
    }
    @Bean
    public CalculatorT1 calculatorT1(){
        CalculatorT1 calculatorT1=new CalculatorT1(3);
        MathFunction[] functions = {cube(),squaredfunction() ,cosFunction()};
        calculatorT1.setFunctions(functions);
        return calculatorT1;
    }


}
