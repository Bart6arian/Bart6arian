package com.kodilla.stream.reference;

public class FunctionalCalculator {
    public static double multiply(double a, double b, double c) {
        return a * b * c;
    }
    public static double add(double a, double b, double c) {
        return a + b + c;
    }
    public static double sub(double a, double b, double c) {
        return a - b - c;
    }
    public static double divide(double a, double b, double c) {
        return a / b;
    }
    public static double powerUp(double a, double b, double c) {
        return ((a*a)*(b*b)*(c*c))*(a*b*c) / 12;
    }

}
