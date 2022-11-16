package org.javaturk.restful.currencyconverter.validation;

import org.javaturk.restful.currencyconverter.domain.Currency;

public class CurrencyValidator {
	
	public boolean validate(String currency) {
		boolean validated = false;
		if(currency.equals(Currency.Celcius.name()) | currency.equals(Currency.Kelvin.name()) | currency.equals(Currency.Fahrenheit.name()))
				validated = true;
			return validated;
	}
}
