package org.javaturk.oopjch03interfaces.trade;

public class OldComputer extends InventoryProduct {

    public OldComputer(String model, double price, double tax, Location location) {
        super(model, price, tax, location);
    }

    @Override
    public void purchase() {

    }
}
