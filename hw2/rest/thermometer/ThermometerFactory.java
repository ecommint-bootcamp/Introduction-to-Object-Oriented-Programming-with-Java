package com.ecommint.spring.rest.thermometer;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ThermometerFactory {


    private double getDefaultDegree(){
        return 0;
    }

    public CelciusThermometer getCelciusThermometer(double degree){
        return new CelciusThermometer(degree);
    }

    public FahrenheitThermometer getFahrenheitThermometer(double degree){
        return new FahrenheitThermometer(degree);
    }

    public KelvinThermometer getKelvinThermometer(double degree){
        return new KelvinThermometer(degree);
    }

    public CelciusThermometer getCelciusThermometer(){
        return new CelciusThermometer(getDefaultDegree());
    }

    public FahrenheitThermometer getFahrenheitThermometer(){
        return new FahrenheitThermometer(getDefaultDegree());
    }

    public KelvinThermometer getKelvinThermometer(){
        return new KelvinThermometer(getDefaultDegree());
    }

    public Thermometer getCustomThermometer(int minDegree,int maxDegree, double degree){
        return new Thermometer(minDegree,maxDegree,degree);
    }

    public Thermometer getCustomThermometer(int minDegree,int maxDegree){
        return new Thermometer(minDegree,maxDegree,getDefaultDegree());
    }
}
