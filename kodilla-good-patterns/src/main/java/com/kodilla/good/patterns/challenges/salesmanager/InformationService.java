package com.kodilla.good.patterns.challenges.salesmanager;

public interface InformationService {
    void fullOrderInfo(String nickname, String name, int quantity, double v, String s, double price, String carrier);
    String moreInfo(Order order);
}
