package com.ecommint.spring.annotation.thermometer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class KelvinThermometer extends Thermometer {
    @Autowired
    public KelvinThermometer(@Qualifier("defaultDegree") double currentDegree) {
        super(273, 373, currentDegree);
    }
}
