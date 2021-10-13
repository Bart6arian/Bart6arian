package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;

public class YoungCustomer extends Customer {

    public YoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
