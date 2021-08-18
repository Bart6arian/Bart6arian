package com.kodilla.stream;

import com.kodilla.stream.iterate.NumberGenerator;

public class MainStream {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        System.out.println("Using Stream to generate evens from 3 to 23");
        NumberGenerator.generateEven(23);
    }
}
