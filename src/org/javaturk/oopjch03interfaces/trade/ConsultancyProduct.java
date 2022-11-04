package org.javaturk.oopjch03interfaces.trade;

public class ConsultancyProduct extends PricedProduct implements Sellable, Consultable {

    public ConsultancyProduct(String sku, String description) {
        super(sku, description);
    }

    @Override
    public void purchase() {

    }

    @Override
    public void giveConsultancy() {

    }
}
