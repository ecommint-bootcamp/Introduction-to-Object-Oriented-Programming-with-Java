package xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class XmlApp {
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("xmlConfiguration.xml");

        CalculatorT1 calculatorT1 = context.getBean("calculatorT1" , CalculatorT1.class);
        startCalculator(calculatorT1);
    }

    public static void startCalculator(CalculatorT1 calculatorT1) {
        calculatorT1.listMathFunction();
        System.out.println("Please enter the name of the function:");
        String functionName = input.next();
        if (functionName.equalsIgnoreCase("end"))
            System.exit(0);
        System.out.println("Please enter the argument of the function:");
        double functionArg = input.nextDouble();
        double result = calculatorT1.doCalculation(functionName, functionArg);
        System.out.println(functionName + " of " + functionArg + " is " + result + "\n");

        startCalculator(calculatorT1);
    }
}
