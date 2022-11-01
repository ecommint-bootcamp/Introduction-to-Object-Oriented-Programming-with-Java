package org.javaturk.oopj.hw1._03.arayuzler.kurum;

public class Location {

    private String depot;
    private String price;


    public Location(String depot, String price) {
        this.depot = depot;
        this.price = price;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
