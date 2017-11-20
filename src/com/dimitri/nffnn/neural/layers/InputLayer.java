package com.dimitri.nffnn.neural.layers;

import com.dimitri.nffnn.neural.Net;
import com.dimitri.nffnn.neural.cells.Cell;
import com.dimitri.nffnn.neural.cells.InputCell;

public class InputLayer extends Layer{

    private InputCell[] cell;

    public InputLayer(Net net, int cellAmount) {
        super(net, 0, cellAmount);
        cell = new InputCell[cellAmount];
    }

    @Override
    public InputCell[] getCell() {
        return cell;
    }

    @Override
    public InputCell getCell(int index) {
        return cell[index];
    }
}
