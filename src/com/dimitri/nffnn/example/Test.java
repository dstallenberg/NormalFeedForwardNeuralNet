package com.dimitri.nffnn.example;

import com.dimitri.nffnn.neural.Net;

import java.io.IOException;

public class Test {

    public static void main(String... args){
        try {
            Net net = new Net("weights.txt");
            net.getIo().Write(net);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
