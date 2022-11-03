package org.javaturk.oopj.hw1.Corporation;

public abstract class SecondHand extends Asset implements Salable {
	protected Location location;
	protected double price;
	protected double tax;


	public SecondHand(String sku, String description, Location location, double price, double tax) {
		super(sku, description);
		this.location = location;
		this.price = price;
		this.tax = tax;
	}

	@Override
	abstract public void purchase();

}
