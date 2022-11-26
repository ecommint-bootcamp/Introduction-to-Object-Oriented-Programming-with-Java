package Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class AnnotationApp {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(IocConfig.class);

        CalculatorT1 calculator1 = context.getBean("calculatorT1", CalculatorT1.class);

        startCalculator(calculator1);
    }

    private static void startCalculator(CalculatorT1 calculator) {
        calculator.listMathFunction();
        System.out.println("Please enter the name of the function:");
        String functionName = input.next();
        if (functionName.equalsIgnoreCase("end"))
            System.exit(0);
        System.out.println("Please enter the argument of the function:");
        double functionArg = input.nextDouble();
        double result = calculator.doCalculation(functionName, functionArg);
        System.out.println(functionName + " of " + functionArg + " is " + result + "\n");

        startCalculator(calculator);
    }
}
