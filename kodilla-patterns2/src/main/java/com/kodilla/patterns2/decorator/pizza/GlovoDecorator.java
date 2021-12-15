package com.kodilla.patterns2.decorator.pizza;

public class GlovoDecorator extends AbstractPizzaDecorator {
    protected GlovoDecorator(PizzaBase pizzaBase) {
        super(pizzaBase);
    }

    @Override
    public Long getCost() {
        return super.getCost() + 3L;
    }

    @Override
    public String pizzaDesc() {
        return super.pizzaDesc() + " by Glovo";
    }
}
