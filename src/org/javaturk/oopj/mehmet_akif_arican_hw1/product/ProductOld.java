public class ProductOld extends ProductNormal{
    double price;
    double tax;

    public ProductOld(String sku, String description, Location location, double price, double tax, double priceOld, double taxOld) {
        super(sku, description, location, price, tax);
        this.price = priceOld;
        this.tax = taxOld;
    }

    @Override
    void purchase() {

    }
}
