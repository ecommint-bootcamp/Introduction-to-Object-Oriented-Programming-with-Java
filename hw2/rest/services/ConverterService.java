package com.ecommint.spring.rest.services;

import java.util.List;

public interface ConverterService {

    double kelvinFromCelcius(double degree);

    double celciusFromKelvin(double degree);

    double celciusFromFahrenheit(double degree);

    double fahrenheitFromCelcius(double degree);
    
    double customFromKelvin(double degree ,int minDegree, int maxDegree);
    
    double customFromFahrenheit(double degree ,int minDegree, int maxDegree);

    double customFromCelcius(double degree ,int minDegree, int maxDegree);

    double kelvinFromCustom(double degree ,int minDegree, int maxDegree);

    double fahrenheitFromCustom(double degree ,int minDegree, int maxDegree);

    double celciusFromCustom(double degree ,int minDegree, int maxDegree);
    List<String> getConvertHistory();
}
