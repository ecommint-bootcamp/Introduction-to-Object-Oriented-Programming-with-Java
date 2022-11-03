package interfaces.question6;

public abstract class Product implements Purchaseable {
    private String sku;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // private double price;

    // public double getPrice() {
    // return price;
    // }

    // public void setPrice(double price) {
    // this.price = price;
    // }

    private double tax;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    // private Location location;

    // public Location getLocation() {
    // return location;
    // }

    // public void setLocation(Location location) {
    // this.location = location;
    // }

    public Product(String sku, String description, double tax) {
        this.sku = sku;
        this.description = description;
        // this.price = price;
        this.tax = tax;
        // this.location = location;
    }
}
