package org.javaturk.restful.currencyconverter.converter;

import org.javaturk.restful.currencyconverter.domain.Conversion;
import org.javaturk.restful.currencyconverter.domain.Currency;
import org.javaturk.restful.currencyconverter.ex.InvalidCurrencyException;

import static org.javaturk.restful.currencyconverter.domain.Currency.*;

import javax.ws.rs.core.Response;

public class CurrencyConverterEngine implements CurrencyConverter {

	public Conversion convert(Conversion conversion) {
		double targetAmount = convert(conversion.getSourceCurrency(), conversion.getTargetCurrency(),
				conversion.getSourceAmount());
		conversion.setTargetAmount(targetAmount);
		return conversion;
	}

	public double convert(Currency sourceCurrency, Currency targetCurrency, double sourceAmount) {
		double targetAmount = 0;
		// First check if source and target currencies are the same.
		if(sourceCurrency.equals(targetCurrency))
			return sourceAmount;
		if (sourceCurrency.equals(Celcius)) {
			switch (targetCurrency) {
			case Fahrenheit:
				targetAmount = sourceAmount*1.8+32;
				break;
			case Kelvin:
				targetAmount = sourceAmount +273.15;
				break;
			}
		} else if (sourceCurrency.equals(Fahrenheit)) {
			switch (targetCurrency) {
			case Celcius:
				targetAmount = (sourceAmount/1.8)-32;
				break;
			case Kelvin:
				targetAmount = (sourceAmount+459.67)*0.555555;
				break;
			}
		} else if (sourceCurrency.equals(Kelvin)) {
			switch (targetCurrency) {
			case Celcius:
				targetAmount = sourceAmount-273.15;
				break;
			case Fahrenheit:
				targetAmount = (sourceAmount-459.67)/0.5555;
				break;
			}
		}
		return targetAmount;
	}
}
