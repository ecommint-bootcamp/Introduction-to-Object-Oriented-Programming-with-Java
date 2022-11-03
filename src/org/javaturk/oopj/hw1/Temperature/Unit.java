package org.javaturk.oopj.hw1.Temperature;

public abstract class Unit {
	
	private double value;

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

}
