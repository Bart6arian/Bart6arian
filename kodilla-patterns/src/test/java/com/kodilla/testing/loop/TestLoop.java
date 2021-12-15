package com.kodilla.testing.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLoop {

    @Test
    void testLoop() {

        long sum = 0;

        for(int x = 0; x < 1000; x++) {
            sum += x;
            System.out.println("[" + x +"] Sum is: " + sum);
        }

        assertEquals(499500, sum);
    }
}
