package com.ecommint.spring.annotation.thermometer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CelciusThermometer extends Thermometer {

    @Autowired
    public CelciusThermometer(@Qualifier("defaultDegree") double currentDegree) {
        super(0, 100, currentDegree);
    }
}
