package org.javaturk.oopj.hw1._03.arayuzler.hesapmakinesi;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new CalculatorT1();
        calculator.addFunction(new SinFunction());
        calculator.addFunction(new CosFunction());
        calculator.addFunction(new LogFunction());
        calculator.addFunction(new FiboniacciFunction());
        calculator.addFunction(new CubeFunction());

        run(calculator);
    }

    private static void run(Calculator calculator){
        Scanner scanner = new Scanner(System.in);
        calculator.listMathFunction();

        System.out.println();
        System.out.println("Fonksiyon seçiniz ,çıkmak için x e basınız : ");
        String function = scanner.nextLine();

        if(function.toLowerCase(Locale.ROOT).equals("x"))
            return;

        try {
        System.out.println("Deger giriniz : ");
        double value = scanner.nextDouble();
            System.out.println("Sonuç : "+ calculator.doCalculation(function, value));
        }catch (NullPointerException exception){
            System.err.println("Böyle bir fonksiyon yok! ");
        }
        catch (InputMismatchException exception){
            System.err.println("Lütfen sayı giriniz !");
        }



        run(calculator);

    }
}
