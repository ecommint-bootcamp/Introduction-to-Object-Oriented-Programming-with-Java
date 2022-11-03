package interfaces.question6;

public class Test {
	public static void main(String[] args) {
		PurchaseOffice office = new PurchaseOffice();
		Purchaseable product = office.getAPurchaseableProduct();
		office.purchaseProduct(product);
	}
}
