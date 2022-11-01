import java.util.Date;

public class ProductFood extends ProductWithPrice{
    Date productionDate;
    int life;

    public ProductFood(String sku, String description, Location location, double price, double tax, Date productionDate, int life) {
        super(sku, description, location, price, tax);
        this.productionDate = productionDate;
        this.life = life;
    }

    @Override
    void purchase() {

    }
}
