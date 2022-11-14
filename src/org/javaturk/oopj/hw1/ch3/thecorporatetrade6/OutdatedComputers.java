package ch3.thecorporatetrade6;

public class OutdatedComputers extends Product implements Sellable{
	protected Location location;
	protected double price;
	protected double tax;

	public OutdatedComputers(String sku, double price, double tax, String description, String name) {
		super(sku, price, tax, description, name);
		this.location = location;
		this.price = price;
		this.tax = tax;
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		
	}

}
