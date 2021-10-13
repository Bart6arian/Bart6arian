package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BigmacTestSuite {

    @Test
    void bigmacBuilderTest() {
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Garlic bread")
                .burgers(2)
                .sauce("Honey-Reaper")
                .ingredients("Cheddar")
                .ingredients("Shrimps")
                .ingredients("Peanut butter")
                .ingredients("Lettuce")
                .ingredients("Chilli oil")
                .ingredients("Onion jam")
                .build();
        System.out.println(bigmac);

        //when
        int burgersNum = bigmac.getBurgers();
        boolean seafood = bigmac.getIngredients().contains("Shrimps");

        //then
        assertEquals(2, burgersNum);
        assertTrue(seafood, bigmac.getIngredients().get(1));
    }
}
