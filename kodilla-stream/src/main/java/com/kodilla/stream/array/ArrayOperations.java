package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static OptionalDouble getAverage(int[]numbers) {
        List<Double> number = new ArrayList<>();
        for(int x = 0; x <= 20; x++) {
            number.add((double) x);
        }
        IntStream.range(0, number.size()).forEach(System.out::println);
        OptionalDouble average = IntStream.range(0, number.size()).average();
        return average;
    }
}
