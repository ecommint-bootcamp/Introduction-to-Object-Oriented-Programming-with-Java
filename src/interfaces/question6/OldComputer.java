package interfaces.question6;

public class OldComputer implements Priceable, Purchaseable {
    String marka;
    double price;

    public OldComputer(String marka, double price) {
        this.marka = marka;
        this.price = price;
    }

    @Override
    public void purchase() {
        System.out.println(
                "i purchase computer. computer is not a product. Computer marka: " + marka + "price: " + price);
    }

    @Override
    public double getPrice() {
        return price;
    }

}
