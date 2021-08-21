package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static OptionalDouble getAverage(int[]numbers) {

        IntStream.range(1, 20).forEach(System.out::println);
        OptionalDouble average = IntStream.range(1, numbers.length)
                .average();
        return average;
    }
}
