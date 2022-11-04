package org.javaturk.oopjch03interfaces.trade;

public abstract class PricedProduct extends Product implements Sellable {

    private double price;
    private double tax;

    public PricedProduct(String sku, String description) {
        super(sku, description);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public void purchase() {

    }
}
