package interfaces.question6;

public class Gift extends Product implements Locateable {
    Location location;

    public Gift(String sku, String description, double tax, Location location) {
        super(sku, description, tax);
        this.location = location;
    }

    @Override
    public void purchase() {
        System.out.println("i purchase gift. Gift is a product but has no price");
    }

    @Override
    public Location getLocation() {
        return location;
    }

}
