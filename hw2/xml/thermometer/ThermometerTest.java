package com.ecommint.spring.xml.thermometer;

public class ThermometerTest {

    public static void main(String[] args) {


        CelciusThermometer celciusThermometer = new CelciusThermometer(-10);
        FahrenheitThermometer fahrenheitThermometer = new FahrenheitThermometer(0);


        ThermometerConverter thermometerConverter = new ThermometerConverterImpl();

        System.out.println(thermometerConverter.convert(celciusThermometer, fahrenheitThermometer));
        System.out.println(thermometerConverter.convert(fahrenheitThermometer, celciusThermometer));

    }
}
