package com.dimitri.nffnn.neural.layers;

import com.dimitri.nffnn.neural.Net;
import com.dimitri.nffnn.neural.cells.HiddenCell;

public class HiddenLayer extends Layer{

    private HiddenCell[] cell;

    public HiddenLayer(Net net, int layerIndex, int cellAmount) {
        super(net, layerIndex, cellAmount);
        cell = new HiddenCell[cellAmount];
    }

    public HiddenLayer(Net net, int layerIndex, double[][] weights) {
        super(net, layerIndex, weights.length);
        cell = new HiddenCell[weights.length];
    }

    @Override
    public HiddenCell[] getCell() {
        return cell;
    }

    @Override
    public HiddenCell getCell(int index) {
        return cell[index];
    }

}
