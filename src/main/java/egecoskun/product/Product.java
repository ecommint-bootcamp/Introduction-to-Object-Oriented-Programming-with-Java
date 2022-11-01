package egecoskun.product;

public class Product extends Item{
    private String sku;
    private double price;
    private double tax;

    public Product(String description, String sku, double price, double tax) {
        super(description);
        this.sku = sku;
        this.price = price;
        this.tax = tax;
    }


}
