package org.emresahna.restful.temperatureconverter.Converter;

import org.emresahna.restful.temperatureconverter.Domains.Temperature;

public interface TemperatureConverter {
    double convert(Temperature source, Temperature target, double amount);
}
