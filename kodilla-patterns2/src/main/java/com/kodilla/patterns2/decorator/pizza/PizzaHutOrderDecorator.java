package com.kodilla.patterns2.decorator.pizza;

public class PizzaHutOrderDecorator extends AbstractPizzaDecorator {

    protected PizzaHutOrderDecorator(PizzaBase pizzaBase) {
        super(pizzaBase);
    }

    @Override
    public Long getCost() {
        return super.getCost() + 10L;
    }

    @Override
    public String pizzaDesc() {
        return super.pizzaDesc() + " ordered in PizzaHut";
    }
}
