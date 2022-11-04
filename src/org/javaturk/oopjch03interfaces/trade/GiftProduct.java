package org.javaturk.oopjch03interfaces.trade;

public abstract class GiftProduct extends Product implements Giftable {

    public GiftProduct(String sku, String description) {
        super(sku, description);
    }

    @Override
    public void sendGift() {

    }
}
