package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;

public class Food2DoorProcessor {
    private ProducerExample producerExample;
    private ProducerExample2 producerExample2;
    private ShopExample shopExample;
    private List<String> producers = new LinkedList<>();

    public Food2DoorProcessor(ProducerExample producerExample,
                              ProducerExample2 producerExample2,
                              ShopExample shopExample) {
        this.producerExample = producerExample;
        this.producerExample2 = producerExample2;
        this.shopExample = shopExample;
    }

    public OrderDto newProducer(OrderDto orderDto,
                                NewProducerDto newProducerDto) {
        if(newProducerDto.available(true)) {
            producers.add(producers.size(), newProducerDto.getNameOfNewProducer());
            new NewProducerDto(producers.get(producers.size()));
            return new OrderDto(orderDto.getValueOfOrder(),
                    String.join("New producer: ", producers), true);
        } else
            return new OrderDto(orderDto.getValueOfOrder(),
                    String.join("New producer add failed: ", producers),
                    false);

    }
}
