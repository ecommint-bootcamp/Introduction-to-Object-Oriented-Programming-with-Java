package com.ecommint.spring.rest.thermometer;

public class Thermometer {

    protected int minDegree;
    protected int maxDegree;
    protected double currentDegree;

    public Thermometer(int minDegree, int maxDegree, double currentDegree) {
        this.minDegree = minDegree;
        this.maxDegree = maxDegree;
        this.currentDegree = currentDegree;
    }

    public int getMinDegree() {
        return minDegree;
    }

    public void setMinDegree(int minDegree) {
        this.minDegree = minDegree;
    }

    public int getMaxDegree() {
        return maxDegree;
    }

    public void setMaxDegree(int maxDegree) {
        this.maxDegree = maxDegree;
    }

    public double getCurrentDegree() {
        return currentDegree;
    }

    public void setCurrentDegree(double currentDegree) {
        this.currentDegree = currentDegree;
    }

    @Override
    public String toString() {
        return "X Thermometer(" +
                "minDegree=" + minDegree +
                ", maxDegree=" + maxDegree +
                ", currentDegree=" + currentDegree +
                ')';
    }


}
