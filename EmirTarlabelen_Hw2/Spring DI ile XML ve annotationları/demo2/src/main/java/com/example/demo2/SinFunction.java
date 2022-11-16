package com.example.demo2;

public class SinFunction implements MathFunction{

    public String getName() {
        return "Sin";
    }

    @Override
    public double calculate(double arg) {
        return Math.sin(arg);
    }
}
