package com.thoughtworks.com.bootcamp;

class Probability {
    private final double probability;

    Probability(double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object object)
    {
        return  (((Probability) object).probability == this.probability);
    }


    Probability nonOccuringProbability() {
        return new Probability(1 - probability);
    }


}
