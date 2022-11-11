package golbekir_hw2_restful.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import golbekir_hw2_restful.converter.ConvertOffice;
import golbekir_hw2_restful.domain.Conversion;
import golbekir_hw2_restful.domain.Conversions;

@Path("/converter")
public class TempetureConverterResource implements TempetureConverterService {

	Conversions conversions = new Conversions();

	@Override
	@GET
	@Produces("application/json")
	public List<String> getConversions() {
		return conversions.listCurrentConversion();
	}

	@Override
	@POST
	@Path("{from}/{to}/{temp}")
	@Produces("application/json")
	public Conversion addConversion(@PathParam("from") String from, @PathParam("to") String to,
			@PathParam("temp") double temp) {
		double result = ConvertOffice.convertFromString(from, to, temp);
		Conversion conversion = new Conversion(from, to, temp, result);
		conversions.addConversion(conversion);
		return conversion;
	}

	@Override
	@GET
	@Produces("application/json")
	@Path("list-all")
	public List<Conversion> listAllConversion() {
		return conversions.listAll();
	}

}
