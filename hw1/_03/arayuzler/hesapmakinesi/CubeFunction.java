package org.javaturk.oopj.hw1._03.arayuzler.hesapmakinesi;

public class CubeFunction implements MathFunction{
    @Override
    public String getName() {
        return "Cube";
    }

    @Override
    public double calculate(double value) {
        return Math.pow(value,3);
    }

    @Override
    public String toString() {
        return getName();
    }
}
