package org.javaturk.oopj.hw1._03.arayuzler.kurum;

import java.util.Date;

public class FoodProduct extends Product{

    private Date productionDate;
    private int life;

    public FoodProduct(String sku, String description, double price, double tax, Location location, Date productionDate, int life) {
        super(sku, description, price, tax, location);
        this.productionDate = productionDate;
        this.life = life;
    }

}
