package com.ecommint.spring.annotation;

import com.ecommint.spring.annotation.thermometer.Thermometer;
import com.ecommint.spring.annotation.thermometer.ThermometerConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);



        convertToCelciusFromKelvin(context);
        convertToFahrenheitFromKelvin(context);
        convertToKelvinFahrenheitFromKelvinFahrenheit(context);


    }

    private static void convertToCelciusFromKelvin(ApplicationContext applicationContext){
        Thermometer celciusThermometer = (Thermometer) applicationContext.getBean("celciusThermometer");
        Thermometer kelvinThermometer = (Thermometer) applicationContext.getBean("kelvinThermometer");

        ThermometerConverter thermometerConverter = (ThermometerConverter) applicationContext.getBean("thermometerConverterImpl");

        System.out.println(
                "Current Degree of Kelvin thermometer : "+kelvinThermometer.getCurrentDegree()+
                        ". its value of celcius format : "+
                        thermometerConverter.convert(kelvinThermometer, celciusThermometer));



    }

    private static void convertToFahrenheitFromKelvin(ApplicationContext applicationContext){
        Thermometer fahrenheitThermometer = (Thermometer) applicationContext.getBean("fahrenheitThermometer");
        Thermometer kelvinThermometer = (Thermometer) applicationContext.getBean("kelvinThermometer");

        ThermometerConverter thermometerConverter = (ThermometerConverter) applicationContext.getBean("thermometerConverterImpl");

        System.out.println(
                "Current Degree of Kelvin thermometer : "+kelvinThermometer.getCurrentDegree()+
                        ". its value of fahrenheit format : "+
                        thermometerConverter.convert(kelvinThermometer, fahrenheitThermometer));
    }


    private static void convertToKelvinFahrenheitFromKelvinFahrenheit(ApplicationContext applicationContext){
        Thermometer fahrenheitThermometer = (Thermometer) applicationContext.getBean("fahrenheitThermometer");
        Thermometer kelvinThermometer = (Thermometer) applicationContext.getBean("kelvinThermometer");

        ThermometerConverter thermometerConverter = (ThermometerConverter) applicationContext.getBean("thermometerConverterImpl");

        System.out.println(
                "Current Degree of fahrenheit thermometer : "+fahrenheitThermometer.getCurrentDegree()+
                        ". its value of kelvin format : "+
                        thermometerConverter.convert( fahrenheitThermometer,kelvinThermometer));
    }
}
