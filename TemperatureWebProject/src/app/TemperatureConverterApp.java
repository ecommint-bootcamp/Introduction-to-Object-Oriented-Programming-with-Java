package app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import resource.TemperatureConverter;

@ApplicationPath("/resources")
public class TemperatureConverterApp  extends Application{
	Set<Object> singletons = new HashSet<>();

	
	public Set<Object> getSingletons() {
//		
		singletons.add(new TemperatureConverter());
		return singletons;
	}
}
