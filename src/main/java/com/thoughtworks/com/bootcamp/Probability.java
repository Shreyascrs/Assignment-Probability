package com.thoughtworks.com.bootcamp;

class Probability {
    private final double probability;

    Probability(double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object object) {
        return (((Probability) object).probability == this.probability);
    }

    @Override
    public int hashCode() {
        if (probability == 0.5) {
            return 1;
        }
        return 0;
    }

    double nonOccuringProbability() {
        return (1 - probability);
    }


}
