package com.ecommint.spring.xml.thermometer;

public class KelvinThermometer extends Thermometer{
    public KelvinThermometer(double currentDegree) {
        super(273, 373, currentDegree);
    }
}
