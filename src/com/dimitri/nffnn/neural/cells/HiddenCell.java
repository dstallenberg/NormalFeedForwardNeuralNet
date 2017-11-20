package com.dimitri.nffnn.neural.cells;

import com.dimitri.nffnn.neural.Connection;
import com.dimitri.nffnn.neural.layers.Layer;

public class HiddenCell extends Cell{

    private double eta = 0.01;
    private double alpha = 0.7;

    Connection[] connection;

    public HiddenCell(Layer layer, int cellIndex, int inputAmount) {
        super(layer, cellIndex);
        connection = new Connection[inputAmount];
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
