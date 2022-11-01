package egecoskun.product;

public class DepotProduct extends Product{
    private String depot;
    private String place;

    public DepotProduct(String description, String sku, double price, double tax, String depot, String place) {
        super(description, sku, price, tax);
        this.depot = depot;
        this.place = place;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
