package com.kodilla.patterns2.decorator.pizza;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuit {

    PizzaBase pizza = new BasicPizza();

    @Test
    void testAddExtraCheese() {
        //given
        pizza = new ExtraCheeseDecorator(pizza);
        //when
        Long cost = pizza.getCost();
        //then
        assertEquals(20L, cost);
    }

    @Test
    void testAddExtraSalami() {
        //given
        pizza = new ExtraSalamiDecorator(pizza);
        //when
        Long cost = pizza.getCost();
        //then
        assertEquals(20L, cost);
    }

    @Test
    void testAddExtraCheeseAndSalami() {
        //given
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ExtraSalamiDecorator(pizza);
        //when
        Long cost = pizza.getCost();
        //then
        assertEquals(25L, cost);
    }

    @Test
    void testExtraSalamiPizzaHutAndDelivery() {
        //given
        pizza = new ExtraSalamiDecorator(pizza);
        pizza = new DominoOrderDecorator(pizza);
        pizza = new DeliveryDecorator(pizza);
        pizza = new UberEatsDecorator(pizza);
        //when
        Long cost = pizza.getCost();
        //then
        assertEquals(44L, cost);
    }
}
