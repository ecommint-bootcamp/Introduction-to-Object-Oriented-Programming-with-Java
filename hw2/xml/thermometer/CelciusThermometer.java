package com.ecommint.spring.xml.thermometer;

public class CelciusThermometer extends Thermometer{
    public CelciusThermometer(double currentDegree) {
        super(0, 100, currentDegree);
    }
}
