abstract class ProductNormal extends ProductLocatable{
    double price;
    double tax;

    public ProductNormal(String sku, String description, Location location, double price, double tax) {
        super(sku, description, location);
        this.price = price;
        this.tax = tax;
    }

    @Override
    void purchase() {

    }
}