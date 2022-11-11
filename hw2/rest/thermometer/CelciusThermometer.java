package com.ecommint.spring.rest.thermometer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class CelciusThermometer extends Thermometer {


    public CelciusThermometer( double currentDegree) {
        super(0, 100, currentDegree);
    }

    @Override
    public String toString() {
        return "CelciusThermometer";
    }
}
