package org.javaturk.oopj.hw1.Corporation;

public abstract class Asset {
	private String sku;
	private String description;
	
	public Asset(String sku, String description) {
		super();
		this.sku = sku;
		this.description = description;
	}
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
