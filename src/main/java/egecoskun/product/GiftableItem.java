package egecoskun.product;

public class GiftableItem extends Item implements Giftable{

    public GiftableItem(String description, String name) {
        super(description, name);
    }

    @Override
    public void sendGift() {

    }
}
