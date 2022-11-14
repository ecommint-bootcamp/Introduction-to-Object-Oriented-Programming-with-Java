package org.emresahna.restful.temperatureconverter;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.emresahna.restful.temperatureconverter.Resources.TemperatureConverterResource;

@ApplicationPath("/temperature")
public class ConverterApplication extends Application {

	Set<Object> singletons = new HashSet<Object>();
	
	@Override
	public Set<Object> getSingletons() {
		singletons.add(new TemperatureConverterResource());
		return singletons;
	}

}
