package com.kodilla.patterns2.decorator.pizza;

public class DominoOrderDecorator extends AbstractPizzaDecorator {

    protected DominoOrderDecorator(PizzaBase pizzaBase) {
        super(pizzaBase);
    }

    @Override
    public Long getCost() {
        return super.getCost() + 12L;
    }

    @Override
    public String pizzaDesc() {
        return super.pizzaDesc() + " ordered in Domino's";
    }
}
