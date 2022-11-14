package ch3.thecorporatetrade6;

public class GivingGift extends Product implements Gifteable {
	protected Location location;

	public GivingGift(String sku, double price, double tax, String description, String name) {
		super(sku, price, tax, description, name);

	}

	@Override
	public void sendGift() {
		// TODO Auto-generated method stub

	}

}
