package com.dimitri.nffnn.neural.cells;

import com.dimitri.nffnn.neural.Connection;
import com.dimitri.nffnn.neural.layers.Layer;

public abstract class Cell {

    private Layer layer;
    private int cellIndex;

    public Cell(Layer layer, int cellIndex){
        this.layer = layer;
        this.cellIndex = cellIndex;
    }
}
