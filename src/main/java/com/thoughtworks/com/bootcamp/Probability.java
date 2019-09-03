package com.thoughtworks.com.bootcamp;

public class Probability {
    private final double probability;

    public Probability(double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object object){
        return (((Probability) object).probability==this.probability);
    }
    @Override
    public  int hashCode(){
        if(this.probability==0.5)
        {
            return  1;
        }
        return  0;
    }
}
