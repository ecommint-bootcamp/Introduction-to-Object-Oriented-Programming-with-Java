public class GiftProduct extends Product{
    public GiftProduct(String sku, String description, Location location) {
        super(sku, description, location);
    }

    @Override
    void purchase() {
        System.out.println("Gift is free.");
    }
}
