package golbekir_hw2_restful.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import golbekir_hw2_restful.converter.Celcius;
import golbekir_hw2_restful.converter.ConvertOffice;
import golbekir_hw2_restful.converter.Kelvin;

public class Conversions {
	private List<Conversion> conversions = Collections.synchronizedList(new ArrayList<>());

	private List<String> currentConversions = Arrays.asList("Celcius", "Fahrenheit", "Kelvin");

	public void addConversion(Conversion conversion) {
		conversions.add(conversion);
	}

	public List<Conversion> listAll() {
		return conversions;
	}

	public List<String> listCurrentConversion() {
		return currentConversions;
	}
}
