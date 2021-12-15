package com.kodilla.patterns2.decorator.pizza;

public class DeliveryDecorator extends AbstractPizzaDecorator {

    protected DeliveryDecorator(PizzaBase pizzaBase) {
        super(pizzaBase);
    }

    @Override
    public Long getCost() {
        return super.getCost() + 7L;
    }

    @Override
    public String pizzaDesc() {
        return super.pizzaDesc() + " delivery chosen";
    }
}
