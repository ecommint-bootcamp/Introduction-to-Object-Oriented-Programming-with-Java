package interfaces.question6;

import java.util.Date;

public class PurchaseOffice {

    public Purchaseable getAPurchaseableProduct() {
        // TODO: Random sayı 4'den fazla gelince hata veriyor.
        int i = (int) (4 * Math.random());
        Purchaseable product = null;

        switch (i) {
            case 1: {
                product = new FoodProduct("Elma", "lezzetli elma", 1.8, new Date(), 10, 10,
                        new Location("x depot", "İstanbul"));
            }

            case 2: {
                product = new ClothProduct("Pantolon", "siyah pantolon", 18, 100, new Location("z depo","�stanbul"), "Erkek", "28-30");
            }

            case 3: {
                product = new ConsultandProduct("Support", "Developmetn support", 180, 1000, "Bekir");
            }

            case 4: {
                product = new OldComputer("Macbook", 10000);
            }

            case 5: {
                product = new Gift("Gift", "gift", 1.8, new Location("z depot", "izmir"));
            }
        }
        return product;
    }

    public void purchaseProduct(Purchaseable product) {
        product.purchase();
    }
}
