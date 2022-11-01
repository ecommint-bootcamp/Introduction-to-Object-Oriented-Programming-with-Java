package egecoskun.product;

public class ConsultancyProduct extends Product implements Sellable{


    public ConsultancyProduct(String description, String sku, double price, double tax) {
        super(description, sku, price, tax);
    }

    @Override
    public void purchase() {

    }
}
