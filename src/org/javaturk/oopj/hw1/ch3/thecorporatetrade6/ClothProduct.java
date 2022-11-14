package ch3.thecorporatetrade6;

public class ClothProduct extends Location implements Sellable {
	private String sex;
	private String size;

	public ClothProduct(String depot, String place, String description, String sku, double price, double tax) {
		super(depot, place, description, sku, price, tax);
		this.sex = sex;
		this.size = size;
	}
	
	@Override
	public void purchase() {
		// TODO Auto-generated method stub

	}

}
