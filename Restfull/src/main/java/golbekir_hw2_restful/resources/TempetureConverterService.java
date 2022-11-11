package golbekir_hw2_restful.resources;

import java.util.List;

import golbekir_hw2_restful.converter.Tempeture;
import golbekir_hw2_restful.domain.Conversion;

public interface TempetureConverterService {
	public List<String> getConversions();

	public Conversion addConversion(String from, String to, double value);

	public List<Conversion> listAllConversion();
}
