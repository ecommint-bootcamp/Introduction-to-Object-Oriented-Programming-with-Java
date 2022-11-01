package org.javaturk.oopj.hw1._03.arayuzler.hesapmakinesi;

public class SinFunction implements MathFunction{
    @Override
    public String getName() {
        return "Sin";
    }

    @Override
    public double calculate(double value) {
        return Math.sin(value);
    }

    @Override
    public String toString() {
        return getName();
    }
}
