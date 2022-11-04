abstract class ProductLocatable extends Product{
    private final Location location;

    public ProductLocatable(String sku, String description, Location location) {
        super(sku, description);
        this.location = location;
    }

    @Override
    void purchase() {

    }
}
