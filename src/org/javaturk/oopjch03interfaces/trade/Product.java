package org.javaturk.oopjch03interfaces.trade;

public abstract class Product {

    private String sku;
    private String description;

    public Product(String sku, String description) {
        this.sku = sku;
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public String getDescription() {
        return description;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
