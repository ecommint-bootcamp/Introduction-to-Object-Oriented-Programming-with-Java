package com.ecommint.spring.xml.thermometer;

public class ThermometerConverterImpl implements ThermometerConverter{
    @Override
    public double convert(Thermometer from, Thermometer to) {
        return to.getMinDegree()+((from.getCurrentDegree()-from.getMinDegree())/(from.getMaxDegree()- from.getMinDegree()))*(to.getMaxDegree()-to.getMinDegree());
    }
}
