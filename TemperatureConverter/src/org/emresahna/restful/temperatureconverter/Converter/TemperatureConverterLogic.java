package org.emresahna.restful.temperatureconverter.Converter;

import org.emresahna.restful.temperatureconverter.Domains.Temperature;

import static org.emresahna.restful.temperatureconverter.Domains.Temperature.*;

public class TemperatureConverterLogic implements TemperatureConverter {
    public double convert(Temperature source, Temperature target, double amount) {
        double targetAmount = 0;
        if(source.equals(target))
            return amount;
        if (source.equals(Celsius)) {
            switch (target) {
                case Fahrenheit:
                    targetAmount = amount + 273.15;
                    break;
                case Kelvin:
                    targetAmount = (amount*(1.8))+32;
                    break;
            }
        } else if (source.equals(Fahrenheit)) {
            switch (target) {
                case Celsius:
                    targetAmount = (amount-32)*(5.0/9.0);
                    break;
                case Kelvin:
                    targetAmount = (amount+459.67)*(5.0/9.0);
                    break;
            }
        } else if (source.equals(Kelvin)) {
            switch (target) {
                case Celsius:
                    targetAmount = amount-273.15;
                    break;
                case Fahrenheit:
                    targetAmount = (amount*(1.8))-459.67;
                    break;
            }
        }
        return targetAmount;
    }
}
