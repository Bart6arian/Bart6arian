package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTestSuite {

    @Test
    void testDefaultInvestingStrategies() {
        //given
        Customer mark = new IndividualCustomer("Mark Bark");
        Customer drake = new YoungCustomer("Drake Cake");
        Customer lee = new CorporateCustomer("Lee Bee");

        //when
        String markShouldBuy = mark.predict();
        System.out.println("Mark should invest: "+markShouldBuy);
        String drakeShouldBuy = drake.predict();
        System.out.println("Drake should buy: "+drakeShouldBuy);
        String leeShouldBuy = lee.predict();
        System.out.println("Lee should invest: "+leeShouldBuy);

        //then
        assertEquals("[Aggressive predictor] Buy stock of XYZ", drakeShouldBuy);
        assertEquals("[Balanced predictor] Buy shared units of Found XYZ", leeShouldBuy);
        assertEquals("[Conservative predictor] Buy debentures of XYZ", markShouldBuy);
    }

    @Test
    void testIndividualStrategies() {
        //given
        Customer mark = new IndividualCustomer("Mark Bark");

        //when
        String markShouldBuy = mark.predict();
        System.out.println("Mark should invest: "+markShouldBuy);
        mark.setBuyingStrategy(new AggressivePredictor());
        markShouldBuy = mark.predict();
        System.out.println("Mark should buy: "+ markShouldBuy);

        //then
        assertEquals("[Aggressive predictor] Buy stock of XYZ", markShouldBuy);
    }
}
