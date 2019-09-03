package com.thoughtworks.com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestProbability {
    @Test
    void GivenTwoProbabilityObjectWithSameZeroPointFive_WhenEqualsCalled_ThenReturnTrue() {
        Probability probabilityWithZeroPointFive = new Probability(0.5);
        Probability anotherProbbilityWithZeroPointFive = new Probability(0.5);
        assertTrue(probabilityWithZeroPointFive.equals(anotherProbbilityWithZeroPointFive));
    }

    void GivenTwoProbabilityObjectWithSameZeroPointFive_WhenHashCodeCalled_ThenExpectedIsOne() {
        Probability probabilityWithZeroPointFive = new Probability(0.5);
        assertEquals(1, probabilityWithZeroPointFive.hashCode());
    }
    @Test
    void givenProbability_WhenNonProbabilityCalled_ThenReturnZeroPointFive(){
        Probability probabilityWithZeroPointFive = new Probability(0.5);
        assertEquals(1-0.5,probabilityWithZeroPointFive.nonOccuringProbability());
    }

}
