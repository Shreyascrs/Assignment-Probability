package com.thoughtworks.com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestProbability {

    @Test
    void GivenTwoProbabilityObjectWithSameZeroPointFive_WhenEqualsCalled_ThenReturnTrue() {
        Probability probabilityWithZeroPointFive = new Probability(0.5);
        Probability anotherProbbilityWithZeroPointFive = new Probability(0.5);
        Assertions.assertTrue(probabilityWithZeroPointFive.equals(anotherProbbilityWithZeroPointFive));
    }

    void GivenTwoProbabilityObjectWithSameZeroPointFive_WhenHashCodeCalled_ThenReturnTrue() {
        Probability probabilityWithZeroPointFive = new Probability(0.5);
        Probability anotherProbbilityWithZeroPointFive = new Probability(0.5);
        Assertions.assertEquals(1,probabilityWithZeroPointFive.hashCode());
    }

}
