package com.thoughtworks.com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestProbability {
    static Probability probabilityWithZeroPointFive;
    static Probability anotherProbbilityWithZeroPointFive;

    @BeforeAll
    static void init() {
        probabilityWithZeroPointFive = new Probability(0.5);
        anotherProbbilityWithZeroPointFive = new Probability(0.5);
    }

    @Test
    void GivenTwoProbabilityObjectWithEqualProbabilities_WhenEqualsCalled_ThenReturnEqual() {

        assertEquals(probabilityWithZeroPointFive, anotherProbbilityWithZeroPointFive);
    }

    @Test
    void givenProbability_WhenNonProbabilityCalled_ThenReturnZeroPointFive() {

        assertEquals(probabilityWithZeroPointFive, probabilityWithZeroPointFive.nonOccuringProbability());
    }

    @Test
    void givenP
}
