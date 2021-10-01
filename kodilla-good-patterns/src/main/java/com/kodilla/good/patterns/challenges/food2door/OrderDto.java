package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {
    private double valueOfOrder;
    private String notes;
    private boolean available;

    public OrderDto(double valueOfOrder, String notes, boolean available) {
        this.valueOfOrder = valueOfOrder;
        this.notes = notes;
        this.available = available;
    }

    public double getValueOfOrder() {
        return valueOfOrder;
    }

}
