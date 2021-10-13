package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTestSuite {

    @Test
    void testPizzaNew() {
        //given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredients("Salami")
                .bottom("Thin")
                .ingredients("Cheddar")
                .sauce("Spicy")
                .build();
        System.out.println(pizza);
        //when
        int howManyIng = pizza.getIngredients().size();
        //then
        assertEquals(2, howManyIng);
    }
}
