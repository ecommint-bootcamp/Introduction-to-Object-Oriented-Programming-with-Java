package interfaces.question6;

public class ConsultandProduct extends Product implements Priceable {
    double price;
    String consultandName;

    public ConsultandProduct(String sku, String description, double tax, double price, String consultandName) {
        super(sku, description, tax);
        this.price = price;
        this.consultandName = consultandName;
    }

    @Override
    public void purchase() {
        System.out.println(
                "i purchase development support. Development support is a consultand product. Consultand name: "
                        + consultandName);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
