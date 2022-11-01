public class ProductOld extends ProductWithPrice{
    double price;
    double tax;

    public ProductOld(String sku, String description, Location location, double price, double tax, double price1, double tax1) {
        super(sku, description, location, price, tax);
        this.price = price1;
        this.tax = tax1;
    }

    @Override
    void purchase() {

    }
}
