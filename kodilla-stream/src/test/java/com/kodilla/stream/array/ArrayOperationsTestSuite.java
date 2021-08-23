package com.kodilla.stream.array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8,9,10, 11, 12, 13, 14, 15, 16, 60, 30, 10 ,20};

        //when

        //then
        IntStream.range(0, numbers.length)
                .forEach(number -> System.out.println(numbers[number]));

        double average = IntStream.range(0, numbers.length).asDoubleStream().average().getAsDouble();
        assertEquals(0, average);

    }
}
