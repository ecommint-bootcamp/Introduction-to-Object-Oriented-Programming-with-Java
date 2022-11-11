package com.ecommint.spring.xml.thermometer;

public class FahrenheitThermometer extends Thermometer{
    public FahrenheitThermometer(double currentDegree) {
        super(32, 212, currentDegree);
    }
}
