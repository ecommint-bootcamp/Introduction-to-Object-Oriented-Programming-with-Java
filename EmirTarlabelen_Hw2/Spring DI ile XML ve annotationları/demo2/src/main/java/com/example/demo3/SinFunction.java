package com.example.demo3;

public class SinFunction implements MathFunction {
    @Override
    public String getName() {
        return "Sin";
    }

    @Override
    public double calculate(double arg) {
        return Math.sin(arg);
    }
}
