package com.dimitri.nffnn.neural.cells;

import com.dimitri.nffnn.neural.Connection;
import com.dimitri.nffnn.neural.Layer;

public class HiddenCell extends Cell{

    Connection[] connection;

    public HiddenCell(Layer layer, int cellIndex, int inputAmount) {
        super(layer, cellIndex);
        connection = new Connection[inputAmount];
    }
}
