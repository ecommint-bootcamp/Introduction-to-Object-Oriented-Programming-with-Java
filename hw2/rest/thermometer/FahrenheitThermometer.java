package com.ecommint.spring.rest.thermometer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class FahrenheitThermometer extends Thermometer {

    public FahrenheitThermometer( double currentDegree) {
        super(32, 212, currentDegree);
    }

    @Override
    public String toString() {
        return "FahrenheitThermometer";
    }
}
