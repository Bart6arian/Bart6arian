package com.kodilla.patterns2.decorator.pizza;

public class BasicPizza implements PizzaBase {

    @Override
    public Long getCost() {
        return 15L;
    }

    @Override
    public String pizzaDesc() {
        return "Basic pizza (cheese and tomato sauce)";
    }
}
