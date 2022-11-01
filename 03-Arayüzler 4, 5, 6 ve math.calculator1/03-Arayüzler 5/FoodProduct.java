import java.util.Date;

public class FoodProduct extends Product{
    public Date productionDate;
    public int life;

    public FoodProduct(String sku, String description, double price, double tax, Location location, Date productionDate, int life) {
        super(sku, description, price, tax, location);
        this.productionDate = productionDate;
        this.life = life;
    }

    @Override
    void purchase() {
        System.out.println("Food price: "+this.price);
    }
}
