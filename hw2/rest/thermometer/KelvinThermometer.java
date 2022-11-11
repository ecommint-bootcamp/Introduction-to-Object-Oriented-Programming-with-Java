package com.ecommint.spring.rest.thermometer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class KelvinThermometer extends Thermometer {

    public KelvinThermometer( double currentDegree) {
        super(273, 373, currentDegree);
    }

    @Override
    public String toString() {
        return "KelvinThermometer";
    }
}
