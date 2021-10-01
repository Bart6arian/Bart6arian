package com.kodilla.good.patterns.challenges.food2door;

public class NewProducerDto {
    private String nameOfNewProducer;

    public NewProducerDto(String nameOfNewProducer) {
        this.nameOfNewProducer = nameOfNewProducer;
    }

    public String getNameOfNewProducer() {
        return nameOfNewProducer;
    }

    public boolean available(boolean y) {
        boolean result = false;
        if(y) {
            result = true;
        }
        return result;
    }
}
