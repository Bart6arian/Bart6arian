package com.kodilla.stream.array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8,9,10, 11, 12, 13, 14, 15, 16, 17, 18, 19 ,20};
        //when
        getAverage(numbers);
        //then
        IntStream arrayOperations1 = IntStream.range(1, 20);

        double expected = 10;
        double arrayOperations2 = IntStream.range(1, numbers.length)
                        .average()
                        .getAsDouble();
        assertEquals(expected, arrayOperations2);

    }
}
