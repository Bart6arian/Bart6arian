package com.kodilla.patterns2.decorator.pizza;

public class ExtraCheeseDecorator extends AbstractPizzaDecorator {
    protected ExtraCheeseDecorator(PizzaBase pizzaBase) {
        super(pizzaBase);
    }

    @Override
    public Long getCost() {
        return super.getCost() + 5L;
    }

    @Override
    public String pizzaDesc() {
        return super.pizzaDesc() + " extra cheese added";
    }
}
