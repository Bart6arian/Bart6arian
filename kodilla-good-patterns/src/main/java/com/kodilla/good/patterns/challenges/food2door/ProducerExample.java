package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;

public class ProducerExample {
    private String name;
    private CompanyInfo companyInfo;
    private FoodInformation foodInformation;
    private Carrier carrier;
    private List<String> shops = new LinkedList<>();

    public ProducerExample(String name, CompanyInfo companyInfo,
                           FoodInformation foodInformation, Carrier carrier,
                           List<String> shops) {
        this.name = name;
        this.companyInfo = companyInfo;
        this.foodInformation = foodInformation;
        this.carrier = carrier;
        this.shops = shops;
    }

    public OrderDto process(ShopExample shopExample) {
        boolean result = shopExample.getOrder().isDone();
        if(result) {
            companyInfo.oderValue();
            companyInfo.orderInfo(shopExample.getShopName(),
                    carrier.costForShipping(), carrier.carrierName(),
                    foodInformation.quantity(), foodInformation.qualityChar());
            String ex = shopExample.getShopName();
            shops.add(ex);
            return new OrderDto(companyInfo.oderValue(),
                    shopExample.getShopName(), true);
        } else {
            return new OrderDto(companyInfo.oderValue(),
                    shopExample.getShopName(), false);
        }
    }
}
