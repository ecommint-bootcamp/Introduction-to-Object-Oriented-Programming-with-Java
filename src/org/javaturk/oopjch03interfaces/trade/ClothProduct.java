package org.javaturk.oopjch03interfaces.trade;

public class ClothProduct extends LocatableProduct {
    private String sex;
    private String size;

    public ClothProduct(String sku, String description, Location location, String sex, String size) {
        super(sku, description, location);
        this.sex = sex;
        this.size = size;
    }

    public void purchase() {
        System.out.println("ClothProduct::purchase worked");
    }
}
