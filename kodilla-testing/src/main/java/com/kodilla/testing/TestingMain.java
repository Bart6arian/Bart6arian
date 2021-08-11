package com.kodilla.testing;
import com.kodilla.testing.calculator.Claculator;

public class TestingMain {
    public static void main(String[] args) {
    Claculator calc = new Claculator();
    int add = calc.add(22, 33);
    int substract = calc.substract(10,40);
        if(add == 55) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect!");
        }
        if(substract == 32) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
