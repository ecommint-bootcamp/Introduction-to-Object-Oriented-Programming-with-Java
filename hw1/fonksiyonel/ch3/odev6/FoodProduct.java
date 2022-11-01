package hw1.fonksiyonel.ch3.odev6;

import java.util.Date;

public class FoodProduct extends StoredProduct implements ISellableProduct {
	private Date productionDate;
	private Date lastUsageDate;

	public FoodProduct(String description, String name, int id, int stock, double price, double tax, String storeAdress,
			Date productionDate, Date lastUsageDate) {
		super(description, name, id, stock, price, tax, storeAdress);
		this.productionDate = productionDate;
		this.lastUsageDate = lastUsageDate;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public Date getLastUsageDate() {
		return lastUsageDate;
	}

	public void setLastUsageDate(Date lastUsageDate) {
		this.lastUsageDate = lastUsageDate;
	}

	@Override
	public void purchase() {
		System.out.println(getName() + " food product has been purchased.");
		
	}

}
