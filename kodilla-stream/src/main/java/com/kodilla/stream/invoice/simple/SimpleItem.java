package com.kodilla.stream.invoice.simple;

public final class SimpleItem {
    private final SimpleProduct simpleProduct;
    private final double quantity;

    public SimpleItem(final SimpleProduct simpleProduct,final double quantity) {
        this.simpleProduct = simpleProduct;
        this.quantity = quantity;
    }

    public SimpleProduct getSimpleProduct() {
        return simpleProduct;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return simpleProduct.getProductPrice() * quantity;
    }
}
