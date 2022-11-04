package org.javaturk.oopjch03interfaces.trade;

import java.util.Date;

public class FoodProduct extends LocatableProduct {
    private Date productionDate;
    private int life;

    public FoodProduct(String sku, String description, Location location, Date productionDate, int life) {
        super(sku, description, location);
        this.productionDate = productionDate;
        this.life = life;
    }

    public void purchase() {
        System.out.println("FoodProduct::purchase worked");
    }
}
