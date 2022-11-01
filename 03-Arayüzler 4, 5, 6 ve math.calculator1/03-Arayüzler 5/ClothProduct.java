public class ClothProduct extends Product{
    public String sex;
    public String size;

    public ClothProduct(String sku, String description, double price, double tax, Location location, String sex, String size) {
        super(sku, description, price, tax, location);
        this.sex = sex;
        this.size = size;
    }

    @Override
    void purchase() {
        System.out.println("Cloth price: "+this.price);
    }
}
