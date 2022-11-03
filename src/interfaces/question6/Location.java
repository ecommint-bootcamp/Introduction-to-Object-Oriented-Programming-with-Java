package interfaces.question6;

public class Location {
    private String depot;

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    private String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Location(String depot, String place) {
        this.depot = depot;
        this.place = place;
    }
}
