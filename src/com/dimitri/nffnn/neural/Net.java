package com.dimitri.nffnn.neural;

import com.dimitri.nffnn.neural.cells.HiddenCell;
import com.dimitri.nffnn.neural.layers.HiddenLayer;
import com.dimitri.nffnn.neural.layers.InputLayer;
import com.dimitri.nffnn.neural.layers.Layer;

public class Net {

    private Layer[] layer;

    public Net(int[] topology){
        if(topology.length >= 2){
            layer = new Layer[topology.length];
            layer[0] = new InputLayer(this, topology[0]);
            for (int i = 1; i < topology.length; i++) {
                layer[i] = new HiddenLayer(this, i, topology[i]);
            }
        }else{
            throw new IllegalArgumentException("Nets need at least 2 layers");
        }
    }

    public Net(String filePath){
        IO io = new IO(filePath);
        io.Read();
        int[] topology = io.getTopology();

        if(topology.length >= 2){
            layer = new Layer[topology.length];
            layer[0] = new InputLayer(this, topology[0]);
            for (int i = 0; i < topology.length; i++) {
                layer[i] = new HiddenLayer(this, i, io.getLayerWeights(i));
            }
        }else{
            throw new IllegalArgumentException("Nets need at least 2 layers");
        }
    }







    public Layer[] getLayer() {
        return layer;
    }

    public double getEta() {
        return ((HiddenLayer)layer[1]).getCell(0).getEta();
    }

    public double getAlpha() {
        return ((HiddenLayer)layer[1]).getCell(0).getAlpha();
    }

    public void setEta(double eta) {
        for (int i = 1; i < layer.length; i++) {
            for (int j = 0; j < ((HiddenLayer)layer[i]).getCell().length; j++) {
                HiddenCell cell = ((HiddenLayer)layer[i]).getCell(j);
                cell.setEta(eta);
            }
        }
    }

    public void setAlpha(double alpha) {
        for (int i = 1; i < layer.length; i++) {
            for (int j = 0; j < ((HiddenLayer)layer[i]).getCell().length; j++) {
                HiddenCell cell = ((HiddenLayer)layer[i]).getCell(j);
                cell.setAlpha(alpha);
            }
        }
    }
}
