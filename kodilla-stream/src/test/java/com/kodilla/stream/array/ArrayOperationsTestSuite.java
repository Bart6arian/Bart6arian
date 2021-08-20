package com.kodilla.stream.array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        int[]numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8,9,10, 11, 12, 13, 14, 15, 16, 17, 18, 19 ,20};
        //when
        getAverage(numbers);
        //then
        IntStream arrayOperations1 = IntStream.range(0, 20);
        assertEquals(20, arrayOperations1);

        OptionalDouble average = IntStream.range(0, 20).average();
        assertEquals(0, average);


    }
}
