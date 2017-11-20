package com.dimitri.nffnn.neural;

public class Net {

    private Layer[] layer;

    public Net(int[] topology){
        if(topology.length >= 2){
            layer = new Layer[topology.length];
            for (int i = 0; i < topology.length; i++) {
                layer[i] = new Layer(this, i, topology[i]);
            }
        }else{
            throw new IllegalArgumentException("Nets need at least 2 layers");
        }
    }
}
