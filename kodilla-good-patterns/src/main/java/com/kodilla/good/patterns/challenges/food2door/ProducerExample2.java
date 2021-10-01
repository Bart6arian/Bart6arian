package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ProducerExample2 {
    private String name;
    private CompanyInfo companyInfo;
    private FoodInformation foodInformation;
    private Carrier carrier;
    private List<Order> orders = new LinkedList<>();

    public ProducerExample2(String name, CompanyInfo companyInfo,
                            Carrier carrier,
                            List<Order> orders) {
        this.name = name;
        this.companyInfo = companyInfo;
        this.carrier = carrier;
        this.orders = orders;
    }

    public OrderDto process(Customer customer) {
        int order = new Random().nextInt(11);
        String id = "order"+"order"+"order";
        List<String> ordersToProcess = new LinkedList<>();
        if(customer.getOrder().getValue() > 59.99) {
            for (int n = 0; n <= orders.size(); n++) {
                orders.get(n);
                ordersToProcess.add(n, id + carrier.carrierName()
                        + foodInformation.quantity() +
                        foodInformation.qualityChar());
            }
            return new OrderDto(companyInfo.oderValue(),
                    String.join("Order to do: ", ordersToProcess.get(0)), true);
        } else
            return new OrderDto(companyInfo.oderValue(),
                    String.join("Order failed: ", ordersToProcess.get(0)),
                    false);
    }

}
