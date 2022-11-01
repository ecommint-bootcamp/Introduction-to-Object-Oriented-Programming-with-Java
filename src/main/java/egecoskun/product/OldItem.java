package egecoskun.product;

public class OldItem extends Item implements Sellable{

    private String condition;
    private double price;

    public OldItem(String description, String name, String condition, double price) {
        super(description, name);
        this.condition = condition;
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void purchase() {

    }
}
