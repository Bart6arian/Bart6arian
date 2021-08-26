package com.kodilla.exception.io;
import com.kodilla.exception.test.ChallengeException;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void probablyIWillThrowException() {
        SecondChallenge secondChallenge = new SecondChallenge();
        Random random = new Random();
        int setNum = random.nextInt(3);
        String number = "incorrect numbers";
        //then
        assertThrows(ChallengeException.class, () -> secondChallenge.probablyIWillThrowException(2, setNum));
    }
    @Test
    void testIfOneIsOk() {
        SecondChallenge secondChallenge = new SecondChallenge();
        Random random = new Random();
        int setNum = random.nextInt(3);
        //then
        assertThrows(ChallengeException.class, () -> secondChallenge.probablyIWillThrowException(setNum, 1.5));
    }
    @Test
    void testIfOneIs0() {
        SecondChallenge secondChallenge = new SecondChallenge();
        Random random = new Random();
        int setNum = random.nextInt(3);
        //then
        assertThrows(ChallengeException.class, () -> secondChallenge.probablyIWillThrowException(0, setNum));
    }

}
