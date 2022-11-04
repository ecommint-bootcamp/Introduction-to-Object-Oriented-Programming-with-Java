public class ProductCons extends ProductNormal{

    public ProductCons(String sku, String description, Location location, double price, double tax) {
        super(sku, description, location, price, tax);
    }

    @Override
    void purchase() {

    }
}
