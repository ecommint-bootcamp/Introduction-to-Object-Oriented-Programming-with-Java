package org.javaturk.oopj.hw1._03.arayuzler.hesapmakinesi;

public class LogFunction implements MathFunction{
    @Override
    public String getName() {
        return "Log";
    }

    @Override
    public double calculate(double value) {
        return Math.log(value);
    }

    @Override
    public String toString() {
        return getName();
    }
}
