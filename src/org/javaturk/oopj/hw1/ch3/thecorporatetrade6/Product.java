package ch3.thecorporatetrade6;

public class Product extends ProductDetails{
	private String sku;
	private double price;
	private double tax;

	public Product(String sku, double price, double tax, String description,String name) {
		super(description,name);
		this.sku = sku;
		this.price = price;
		this.tax = tax;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
