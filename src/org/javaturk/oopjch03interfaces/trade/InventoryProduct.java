package org.javaturk.oopjch03interfaces.trade;

public abstract class InventoryProduct  implements Sellable {
    private String model;
    private double price;
    private double tax;
    private Location location;

    public InventoryProduct(String model, double price, double tax, Location location) {
        this.model = model;
        this.price = price;
        this.tax = tax;
        this.location = location;
    }

    @Override
    public void purchase() {

    }
}
