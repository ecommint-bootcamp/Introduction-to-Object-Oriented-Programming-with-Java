package org.javaturk.oopj.hw1._03.arayuzler.hesapmakinesi;

public class CosFunction implements MathFunction{
    @Override
    public String getName() {
        return "Cos";
    }

    @Override
    public double calculate(double value) {
        return Math.cos(value);
    }

    @Override
    public String toString() {
        return getName();
    }
}
