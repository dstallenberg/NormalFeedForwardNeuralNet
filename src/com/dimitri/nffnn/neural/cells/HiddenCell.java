package com.dimitri.nffnn.neural.cells;

import com.dimitri.nffnn.neural.Connection;
import com.dimitri.nffnn.neural.layers.Layer;

import java.util.Random;

public class HiddenCell extends Cell{

    private double eta = 0.01;
    private double alpha = 0.7;

    private Connection[] connection;

    public HiddenCell(Layer layer, int cellIndex, int inputAmount) {
        super(layer, cellIndex);
        connection = new Connection[inputAmount+1];
        for (int i = 0; i < connection.length; i++) {
            connection[i] = new Connection(getRandom());
        }
    }

    public HiddenCell(Layer layer, int cellIndex, int inputAmount, double[] weights) {
        super(layer, cellIndex);
        connection = new Connection[inputAmount+1];
        for (int i = 0; i < connection.length; i++) {
            connection[i] = new Connection(weights[i]);
        }
    }

    public Connection[] getConnection(){
        return connection;
    }

    public Connection getConnection(int index){
        return connection[index];
    }

    public double getRandom(){
        return (new Random().nextDouble()*2)-1;
    }

    public double getEta() {
        return eta;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setEta(double eta) {
        this.eta = eta;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
}
