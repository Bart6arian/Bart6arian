package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        if (b == 0) {
            try {
                return a/b;
            } catch (ArithmeticException e) {

                System.out.println("Illegal move");
            } finally {

                System.out.println("You can not divide by 0");
            }
        }
        return  a / b;
    }

    public static void main(String[] args) throws ArithmeticException {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println("Don't try this at home! \n\nResults is following: ");
        System.out.println(result);
    }
}
