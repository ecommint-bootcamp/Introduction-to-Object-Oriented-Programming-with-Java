package hw1.fonksiyonel.ch3.odev6;

public class OldProduct extends Item implements ISellableProduct {
	private String condition;
	private double price;

	public OldProduct(String description, String name, int id, String condition, double price) {
		super(description, name, id);
		this.condition = condition;
		this.price = price;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void purchase() {
		System.out.println(getName() + " named old product has been purchased.");
		
	}

}
