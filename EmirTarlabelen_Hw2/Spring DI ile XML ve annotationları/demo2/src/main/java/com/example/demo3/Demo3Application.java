package com.example.demo3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class Demo3Application {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(HomeworkConfig.class);
        CalculatorT1 calculatorT1= context.getBean("calculatorT1",CalculatorT1.class);
        try {
            startCalculator(calculatorT1);
        }

        catch(NullPointerException hata){
            System.out.println("Eksik sayida fonksiyon girdiniz!!!");
        }
        catch(InputMismatchException hata2){
            System.out.println("sayi disinda terim girilemez!!!");
        }
        catch(ArrayIndexOutOfBoundsException hata3) {
            System.out.println("5 den fazla fonksiyon yazilamaz!!!");
        }

    }

    private static void startCalculator(CalculatorT1 calculator) {
        calculator.listMathFunction();

        System.out.println("Please enter the name of the function:");
        String functionName = in.next();
        if(functionName.equalsIgnoreCase("end"))
            System.exit(0);
        System.out.println("Please enter the argument of the function:");
        double functionArg = in.nextDouble();
        double result = calculator.doCalculation(functionName, functionArg);
        System.out.println(functionName + " of " + functionArg + " is " + result + "\n");

        startCalculator(calculator);
    }
}
