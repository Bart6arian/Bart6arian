package com.kodilla.good.patterns.challenges.food2door;

public class ShopExample {
    private String shopName;
    private Order order;

    public ShopExample(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public Order getOrder() {
        return order;
    }
}
