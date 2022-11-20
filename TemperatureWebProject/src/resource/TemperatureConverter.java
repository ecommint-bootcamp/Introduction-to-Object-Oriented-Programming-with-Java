package resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import converter.Convert;
import converter.Converter;
import converter.ToCelcius;
import converter.ToFahrenheit;
import converter.ToKelvin;
import domain.Celcius;
import domain.Conversion;
import domain.Conversions;
import domain.Fahrenheit;
import domain.Kelvin;
import domain.Unit;
import validation.Validator;

@Path("/converter")
public class TemperatureConverter {

		private static Conversions conversions = new Conversions();
		Validator validator = new Validator();
		
		
		public TemperatureConverter() {
			// Just to see how many instances are created.
//			counter++;
//			objectCounter = counter;
//			System.out.println("Object count: " + objectCounter);
		}
		
		@GET
		@Produces("application/json")
		public List<Conversion> getAllConversions() {
			
			return conversions.getConversions();
		}
		
		@GET
		@Path("temperatures")

		@Produces("application/json")
		public List<String> getAllTemperatures() {
			
			return conversions.getTemperatures();
		}
		
		@POST
		@Path("{from}/{to}/{temp}")
		@Produces("application/json")
		public Conversion addConversion(@PathParam("from") String from, @PathParam("to") String to,
				@PathParam("temp") double temp) {
			
			if(!validator.validate(from, to)) {
			System.out.println("hata");
			throw new WebApplicationException("currency is not supported!",Response.Status.BAD_REQUEST);
			}
			
			Conversion conversion = Converter.convert(from, to, temp);
			
			conversions.addConversion(conversion);
			
			return conversion;
		}
	
}
