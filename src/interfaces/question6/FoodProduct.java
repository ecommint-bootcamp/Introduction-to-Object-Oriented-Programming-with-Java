package interfaces.question6;

import java.util.Date;

public class FoodProduct extends Product implements Locateable, Priceable {
    Date productionDate;
    int life;
    double price;
    Location location;

    public FoodProduct(String sku, String description, double tax, Date productionDate, int life, double price,
            Location location) {
        super(sku, description, tax);
        this.productionDate = productionDate;
        this.life = life;
        this.price = price;
        this.location = location;
    }

    @Override
    public void purchase() {
        System.out.println("i purchase apple. Apple is a food product");
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Location getLocation() {
        return location;
    }

}
