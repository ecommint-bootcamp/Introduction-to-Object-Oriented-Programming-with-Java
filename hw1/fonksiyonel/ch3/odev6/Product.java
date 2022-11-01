package hw1.fonksiyonel.ch3.odev6;

public class Product extends Item {

	private int stock;
	private double price;
	private double tax;

	public Product(String description, String name, int id, int stock, double price, double tax) {
		super(description, name, id);
		this.stock = stock;
		this.price = price;
		this.tax = tax;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
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
