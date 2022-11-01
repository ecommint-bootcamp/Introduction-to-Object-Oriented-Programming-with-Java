package egecoskun.product;

public class ClothProduct extends DepotProduct implements Sellable{
    private String sex;
    private String size;

    public ClothProduct(String description, String sku, double price, double tax, String depot, String place, String sex, String size) {
        super(description, sku, price, tax, depot, place);
        this.sex = sex;
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void purchase() {

    }
}
