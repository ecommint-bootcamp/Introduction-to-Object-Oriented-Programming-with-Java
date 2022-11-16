package org.javaturk.restful.currencyconverter.domain;

import java.util.Arrays;
import java.util.List;

public enum Currency {
	Celcius("Celcius"), Fahrenheit("Fahrenheit"), Kelvin("Kelvin");
	
	private String description;
	
	private Currency(String description) {
		this.description = description;
	}
	
	public static List<Currency> getCurrencyList(){
		List<Currency> list =Arrays.asList(Currency.values());
		return list;
	}
	
	public static Currency switchToCurrency(String currencyString) {
		Currency currency = null;
		switch (currencyString) {
		case "Celcius":
			currency = Currency.Celcius;
			break;
			
		case "Kelvin":
			currency = Currency.Kelvin;
			break;
			
		case "Fahrenheit":
			currency = Currency.Fahrenheit;
			break;
		}	
		
		return currency;
	}
}
