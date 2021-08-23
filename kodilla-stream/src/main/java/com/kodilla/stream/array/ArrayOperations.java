package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[]numbers) {

        IntStream.range(0, numbers.length).forEach(number -> System.out.println(numbers[number]));

        double average = IntStream.range(0, numbers.length)
                .map(t -> numbers[t])
                .average()
                .getAsDouble();

        return average;
    }
}
