public class ProductCloth extends ProductNormal{
    String sex;
    String size;

    public ProductCloth(String sku, String description, Location location, double price, double tax, String sex, String size) {
        super(sku, description, location, price, tax);
        this.sex = sex;
        this.size = size;
    }

    @Override
    void purchase() {

    }
}
