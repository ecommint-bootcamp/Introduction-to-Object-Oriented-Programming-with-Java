public class OldProduct extends Product{
    public OldProduct(String sku, String description, double price, double tax, Location location) {
        super(sku, description, price, tax, location);
    }

    @Override
    public String getSku() {
        return super.getSku();
    }

    @Override
    public void setSku(String sku) {
        super.setSku(sku);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getTax() {
        return super.getTax();
    }

    @Override
    public void setTax(double tax) {
        super.setTax(tax);
    }

    @Override
    public Location getLocation() {
        return super.getLocation();
    }

    @Override
    public void setLocation(Location location) {
        super.setLocation(location);
    }

    @Override
    void purchase() {
        System.out.println("Old product price: "+this.price);
    }

}
