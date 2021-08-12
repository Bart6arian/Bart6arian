package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {
        ArrayList<Integer> evens = new ArrayList<>();
            for(int checker : numbers) {
                if(checker %2 == 0) {
                    evens.add(checker);

            }
        }
        return evens;
    }

    public static void main(String[] args) {
    }
}

