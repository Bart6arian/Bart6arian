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
        double result2 = firstChallenge.divide(0, 5);

        System.out.println("Don't try this at home! \n\nResults are following: ");
        System.out.println(result);
        System.out.println(result2);
    }
}
