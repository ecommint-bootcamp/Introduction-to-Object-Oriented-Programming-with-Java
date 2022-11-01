package egecoskun.product;

import java.util.Date;

public class FoodProduct extends DepotProduct implements Sellable{
    private Date productionDate;
    private int life;

    public FoodProduct(String description, String sku, double price, double tax, String depot, String place, Date productionDate, int life) {
        super(description, sku, price, tax, depot, place);
        this.productionDate = productionDate;
        this.life = life;
    }


    @Override
    public void purchase() {

    }
}
