package interfaces.question6;

public class ClothProduct extends Product implements Locateable, Priceable {
	double price;
	Location location;
    String sex;
    String size;

    public ClothProduct(String sku, String description, double tax, double price, Location location, String sex,String size) {
        super(sku, description, tax);
        this.price = price;
        this.location = location;
        this.sex = sex;
        this.size = size;
    }

    @Override
    public void purchase() {
        System.out.println("i purchase t-shirt. T-shirt is a cloth product");
    }

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public Location getLocation() {
		return location;
	}
}
