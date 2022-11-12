package org.javaturk.oopj.hw1.Temperature;

public abstract class Unit {
	
	protected double value;

	public Unit(double value) {
		super();
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	
	public Unit convert(Converter calculator) {		
		return calculator.calculate(this);
	}

}
