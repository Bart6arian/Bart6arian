package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        return  a / b;
    }

    public static void main(String[] args)  {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

            try {
                System.out.println(result);
            } catch (ArithmeticException e) {

                System.out.println("Illegal move");
            } finally {

                System.out.println("You can not divide by 0");
            }

        System.out.println("Don't try this at home!");
    }
}
