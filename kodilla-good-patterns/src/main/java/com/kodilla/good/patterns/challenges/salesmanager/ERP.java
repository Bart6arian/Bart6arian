package com.kodilla.good.patterns.challenges.salesmanager;

public class ERP {
    private int quantity;
    private int tax;

    public ERP(int quantity, int tax) {
        this.quantity = quantity;
        this.tax = tax;
    }

    public int setQuantity(int quantity) {
        return this.quantity;
    }

    public int getTax(double v) {
        return tax;
    }
}
