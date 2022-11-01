package hw1.fonksiyonel.ch3.odev6;

public class ClothProduct extends StoredProduct implements ISellableProduct {
	private char sex;
	private String size;

	public ClothProduct(String description, String name, int id, int stock, double price, double tax,
			String storeAdress, char sex, String size) {
		super(description, name, id, stock, price, tax, storeAdress);
		this.sex = sex;
		this.size = size;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void purchase() {
		System.out.println(getName() + " cloth product has been purchased.");

	}

}
