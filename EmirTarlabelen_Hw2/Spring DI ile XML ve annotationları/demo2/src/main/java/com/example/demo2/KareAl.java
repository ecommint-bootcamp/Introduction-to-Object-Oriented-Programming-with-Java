package com.example.demo2;

public class KareAl implements MathFunction {
    public String getName() {
        return "Kare";
    }

    @Override
    public double calculate(double arg) {
        return arg*arg;
    }
}
