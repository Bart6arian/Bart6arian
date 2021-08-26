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
        assertAll(
                () -> assertThrows(ChallengeException.class, () -> secondChallenge.probablyIWillThrowException(2, setNum)),
                () -> assertThrows(ChallengeException.class, () -> secondChallenge.probablyIWillThrowException(setNum, 1.5)),
                () -> assertThrows(ChallengeException.class, () -> secondChallenge.probablyIWillThrowException(0, setNum))
        );
    }
}
