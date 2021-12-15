package com.kodilla.patterns2.facade;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {

    public BigDecimal getPrice(Long productId) {
        Random priceGenerator = new Random();
        return new BigDecimal(priceGenerator.nextInt(10000) / 100);
    }
}
