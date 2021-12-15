package com.kodilla.patterns2.decorator.pizza;

public class UberEatsDecorator extends AbstractPizzaDecorator {
    protected UberEatsDecorator(PizzaBase pizzaBase) {
        super(pizzaBase);
    }

    @Override
    public Long getCost() {
        return super.getCost() + 5L;
    }

    @Override
    public String pizzaDesc() {
        return super.pizzaDesc() + " by UberEats";
    }
}
