package com.ecommint.spring.rest.thermometer;

import org.springframework.stereotype.Component;

@Component
public class ThermometerConverterImpl implements ThermometerConverter {
    @Override
    public double convert(Thermometer from, Thermometer to) {
        return to.getMinDegree()+((from.getCurrentDegree()-from.getMinDegree())/(from.getMaxDegree()- from.getMinDegree()))*(to.getMaxDegree()-to.getMinDegree());
    }
}
