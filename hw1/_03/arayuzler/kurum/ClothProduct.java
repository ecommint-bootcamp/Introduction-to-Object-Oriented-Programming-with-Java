package org.javaturk.oopj.hw1._03.arayuzler.kurum;

public class ClothProduct extends Product{

    private String sex;
    private int size;

    public ClothProduct(String sku, String description, double price, double tax, Location location, String sex, int size) {
        super(sku, description, price, tax, location);
        this.sex = sex;
        this.size = size;
    }
}
