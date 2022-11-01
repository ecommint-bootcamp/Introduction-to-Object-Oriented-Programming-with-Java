package org.javaturk.oopj.hw1._03.arayuzler.hesapmakinesi;

public class SquaredFunction implements MathFunction{
    @Override
    public String getName() {
        return "Squared";
    }

    @Override
    public double calculate(double value) {
        return Math.sqrt(value);
    }

    @Override
    public String toString() {
        return getName();
    }
}
