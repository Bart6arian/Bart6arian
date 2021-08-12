package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    private static OddNumbersExterminator OddNumbersExterminator;
        @BeforeEach
        public void before() {
            System.out.println("Test case: begin");
        }

        @AfterEach
        public void after() {
            System.out.println("Test case: end");
        }

        @BeforeClass
        public static void beforeClass() {
            OddNumbersExterminator = new OddNumbersExterminator();
        }

        @DisplayName
                ("Checking for empty list "+" If is empty return error")

        @Test
        public void testOddNumbersExterminatorEmptyList() {
            ArrayList<Integer> isEmpty = new ArrayList<>();
            //When
            List<Integer> result = OddNumbersExterminator.exterminate(isEmpty);
            System.out.println("Test if empty...");
            //then
            Assertions.assertEquals(isEmpty, result);
        }

        @Test
        public void testOddNumbersExterminatorNormalList() {
            ArrayList<Integer> normalOne = new ArrayList<>();
            normalOne.add(43);
            normalOne.add(9);
            normalOne.add(1);
            normalOne.add(2);
            normalOne.add(3);
            normalOne.add(6);
            ArrayList<Integer> listOfevens = new ArrayList<>(Arrays.asList(2, 6));
            ArrayList<Integer> listOfOdds = new ArrayList<>(Arrays.asList(43, 9, 1, 3));

            System.out.println("Nums to be expected in expected list: "+listOfevens);
            System.out.println("Nums to be exterminated in normal List: "+listOfOdds);

            ArrayList<Integer> expected = new ArrayList<>();
            expected.add(2);
            expected.add(6);
            //when
            List<Integer> result = OddNumbersExterminator.exterminate(normalOne);
            System.out.println("Normal list testing...");
            //then
            Assertions.assertEquals(expected, result);
        }
}