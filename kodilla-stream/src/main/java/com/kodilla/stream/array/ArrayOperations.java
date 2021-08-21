package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static void getAverage(int[]numbers) {

        IntStream.range(0, numbers.length).forEach(number -> System.out.println(numbers[number]));
        OptionalDouble average = IntStream.of(numbers).average();
        System.out.println(average);
    }
}
