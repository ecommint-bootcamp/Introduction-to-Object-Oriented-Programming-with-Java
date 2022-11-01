public class ProductAdvicer extends ProductWithPrice{

    public ProductAdvicer(String sku, String description, Location location, double price, double tax) {
        super(sku, description, location, price, tax);
    }

    @Override
    void purchase() {

    }
}
