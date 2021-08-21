package com.kodilla.stream.array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8,9,10, 11, 12, 13, 14, 15, 16, 60, 30, 10 ,20};

        //then
        IntStream.range(0, numbers.length)
                .forEach(number -> System.out.println(numbers[number]));

        OptionalDouble average = IntStream.of(numbers).average();
        assertEquals(0, average);

    }
}
