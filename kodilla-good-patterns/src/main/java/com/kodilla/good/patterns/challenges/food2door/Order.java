package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private String orderId;
    private double value;

    public Order(String orderId, double value) {
        this.orderId = orderId;
        this.value = value;
    }

    public boolean isDone() {
        return true;
    }

    public double getValue() {
        return value;
    }
}
