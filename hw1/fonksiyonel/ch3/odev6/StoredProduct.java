package hw1.fonksiyonel.ch3.odev6;

public class StoredProduct extends Product {
	private String storeAdress;

	public StoredProduct(String description, String name, int id, int stock, double price, double tax,
			String storeAdress) {
		super(description, name, id, stock, price, tax);
		this.storeAdress = storeAdress;
	}

	public String getStoreAdress() {
		return storeAdress;
	}

	public void setStoreAdress(String storeAdress) {
		this.storeAdress = storeAdress;
	}

}
