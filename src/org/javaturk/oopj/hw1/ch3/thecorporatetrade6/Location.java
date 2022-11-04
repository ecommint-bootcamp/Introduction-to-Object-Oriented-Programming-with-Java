package ch3.thecorporatetrade6;

public class Location extends Product{
	private String depot;
	private String place;
	
	public Location(String depot, String place, String description, String sku, double price, double tax) {
		super(sku, price, tax, description, sku);
		this.depot = depot;
		this.place = place;
	}

	public String getDepot() {
		return depot;
	}

	public void setDepot(String depot) {
		this.depot = depot;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
}
