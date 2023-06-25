package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {



    @Test
    void probablyIWillThrowException () {
        // given
        double x = 2;
        double y = 1.5;
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x,y));
    }

    @Test
    void probablyIWillNotThrowException () {
        // given
        double x = 1.5;
        double y = 100;
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x,y));
    }
}