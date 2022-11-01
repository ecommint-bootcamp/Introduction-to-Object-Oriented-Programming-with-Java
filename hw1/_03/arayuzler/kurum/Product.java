package org.javaturk.oopj.hw1._03.arayuzler.kurum;

public class Product {
    private String sku;
    private String description;
    private double price;
    private double tax;
    private Location location;

    public Product(String sku, String description, double price, double tax, Location location) {
        this.sku = sku;
        this.description = description;
        this.price = price;
        this.tax = tax;
        this.location = location;
    }

    public void purchase(){}


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
