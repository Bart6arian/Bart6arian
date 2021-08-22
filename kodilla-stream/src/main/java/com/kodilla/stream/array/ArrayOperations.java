package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[]numbers) {

        IntStream.range(0, numbers.length).forEach(number -> System.out.println(numbers[number]));

        OptionalDouble sumNumbers = IntStream.range(0, Arrays.stream(numbers).sum()).average();

        return sumNumbers;
    }
}
