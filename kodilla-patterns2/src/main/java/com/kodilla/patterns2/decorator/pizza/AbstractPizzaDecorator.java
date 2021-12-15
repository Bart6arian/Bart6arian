package com.kodilla.patterns2.decorator.pizza;

public abstract class AbstractPizzaDecorator implements PizzaBase {
    private final PizzaBase pizzaBase;

    protected AbstractPizzaDecorator(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public Long getCost() {
        return pizzaBase.getCost();
    }

    @Override
    public String pizzaDesc() {
        return pizzaBase.pizzaDesc();
    }
}
