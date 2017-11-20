package com.dimitri.nffnn.neural;

public class Connection {

    double weight;
    double deltaWeight;

    public Connection(double weight){
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getDeltaWeight() {
        return deltaWeight;
    }
}
