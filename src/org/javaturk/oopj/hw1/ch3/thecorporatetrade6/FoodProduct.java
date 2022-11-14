package ch3.thecorporatetrade6;

import java.util.Date;

public class FoodProduct extends Location implements Sellable {
	private Date productionDate;
	private int life;

	public FoodProduct(String depot, String place, String description, String sku, double price, double tax) {
		super(depot, place, description, sku, price, tax);
		this.productionDate = productionDate;
		this.life = life;
	}

	@Override
	public void purchase() {
		System.out.println("I purchase " + getName() + getName() + " is a food product");
	}

}
