package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class MainStream {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");
        System.out.println();
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Boring text", (decor) -> "n0w b3tt3r");
        System.out.println();
        poemBeautifier.beautify("Add some marks", (decor) -> "_-*N3w 'n 4r3sH*-_");
    }
}
