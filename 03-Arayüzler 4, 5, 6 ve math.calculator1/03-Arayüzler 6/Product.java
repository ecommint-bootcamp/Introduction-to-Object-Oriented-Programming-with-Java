abstract class Product{
    String sku;
    String description;

    public Product(String sku, String description) {
        this.sku = sku;
        this.description = description;
    }

    abstract void purchase();
}
