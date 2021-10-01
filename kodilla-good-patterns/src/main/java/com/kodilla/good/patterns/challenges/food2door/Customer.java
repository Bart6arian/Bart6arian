package com.kodilla.good.patterns.challenges.food2door;

public class Customer {
    private String customerId;
    private Order order;

    public Customer(String customerId, Order order) {
        this.customerId = customerId;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
