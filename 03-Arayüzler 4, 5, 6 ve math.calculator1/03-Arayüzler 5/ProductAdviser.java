public class ProductAdviser extends Product{
    public ProductAdviser(String sku, String description, double price, double tax) {
        super(sku, description, price, tax);
    }

    @Override
    void purchase() {
        System.out.println("Product advise price: "+this.price);
    }
}
