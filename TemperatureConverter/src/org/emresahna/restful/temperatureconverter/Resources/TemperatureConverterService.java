package org.emresahna.restful.temperatureconverter.Resources;

import java.util.List;

import org.emresahna.restful.temperatureconverter.Domains.Conversion;
import org.emresahna.restful.temperatureconverter.Domains.Conversions;
import org.emresahna.restful.temperatureconverter.Domains.Temperature;

public interface TemperatureConverterService {
    List<Temperature> getAllTemperatures();
    Conversions getAllConversions();
    Conversion convert(Temperature source, Temperature target,double amount);
}
