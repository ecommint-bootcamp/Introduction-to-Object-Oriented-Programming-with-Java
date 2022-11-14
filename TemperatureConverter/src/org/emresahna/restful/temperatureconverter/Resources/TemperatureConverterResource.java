package org.emresahna.restful.temperatureconverter.Resources;

import javax.ws.rs.*;

import org.emresahna.restful.temperatureconverter.Converter.TemperatureConverter;
import org.emresahna.restful.temperatureconverter.Converter.TemperatureConverterLogic;
import org.emresahna.restful.temperatureconverter.Domains.Conversion;
import org.emresahna.restful.temperatureconverter.Domains.Conversions;
import org.emresahna.restful.temperatureconverter.Domains.Temperature;

import java.util.List;

@Path("/converter")
public class TemperatureConverterResource implements TemperatureConverterService{
    private TemperatureConverter converter = new TemperatureConverterLogic();
    private static Conversions conversions = new Conversions();
    
    public TemperatureConverterResource() {
	}

	@Override
    @Path("/temperatures")
    @GET
    @Produces("application/json")
    public List<Temperature> getAllTemperatures() {
        return Temperature.getTemperatureList();
    }
    
    @Override
    @Path("/conversions")
	@GET
	@Produces("application/json")
	public Conversions getAllConversions() {
		Conversions conversions = new Conversions();
		conversions.setConversions(TemperatureConverterResource.conversions.getConversions());
		return conversions;
	}

    @Override
    @Path("{from}/{to}/{amount}")
    @POST
    @Produces("application/json")
    public Conversion convert(@PathParam("from") Temperature source,@PathParam("to") Temperature target,@PathParam("amount") double amount) {
        double targetAmount = converter.convert(source,target,amount);
        Conversion result = new Conversion(source,target,targetAmount);
        conversions.addConversion(result);
        return result;
    }
}
