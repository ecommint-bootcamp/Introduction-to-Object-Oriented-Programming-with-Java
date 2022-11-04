package org.javaturk.oopjch03interfaces.trade;

public class LocatableProduct extends PricedProduct {
    private Location location;

    public LocatableProduct(String sku, String description, Location location) {
        super(sku, description);
        this.location = location;
    }
}
