package com.kodilla.exception.test;

import java.util.Random;

public class ExceptionHandling {
    SecondChallenge secondChallenge = new SecondChallenge();

    public void handleException() throws ChallengeException {
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(6, 2));
        } catch (Exception e) {
            throw new ChallengeException();
        } finally {
            System.out.println("Impossible movement");
        }
    }
}
