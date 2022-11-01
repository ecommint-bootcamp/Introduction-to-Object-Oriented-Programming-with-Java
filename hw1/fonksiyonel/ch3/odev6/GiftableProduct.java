package hw1.fonksiyonel.ch3.odev6;

public class GiftableProduct extends Item implements IGiftItems {
	private String giftType;

	public GiftableProduct(String description, String name, int id, String giftType) {
		super(description, name, id);
		this.giftType = giftType;
	}

	public String getGiftType() {
		return giftType;
	}

	public void setGiftType(String giftType) {
		this.giftType = giftType;
	}

	@Override
	public void giftItem() {
		System.out.println(getName() + " gifted to customer.");
		
	}

}
