package com.kodilla.stream.sand;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SandStorageTestSuite {

    @Test
    void testGetSandGrainsQuantity() {
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Africa());
        continents.add(new Asia());
        continents.add(new Europe());
        //when
        BigDecimal totalSand = BigDecimal.ZERO;
        for(SandStorage continent : continents) {
            totalSand = totalSand.add(continent.getSandGrainsQuantity());
        }
        //then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(expectedSand, totalSand);
    }

    @Test
    void testGetSandBeansQuantityWithReduce() {
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
        //when
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandGrainsQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(expectedSand, totalSand);

    }
}
