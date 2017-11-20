package com.dimitri.nffnn.example;

import com.dimitri.nffnn.neural.Net;

import java.io.IOException;
import java.util.Random;

public class Test {

    public static void main(String... args){
        try {
            Net net = new Net(new int[]{2,5,2});
            Random random = new Random();
            double[] input = new double[2];
            double[] target = new double[2];

            for (int i = 0; i < 1000; i++) {
                input[0] = random.nextInt(2);
                input[1] = random.nextInt(2);

                if(input[0] == input[1]){
                    target[0] = 1;
                    target[1] = 0;
                }else{
                    target[0] = 0;
                    target[1] = 1;
                }

                net.feedForward(input);
                net.backPropogation(target);
                double[] output = net.getOutput();
                System.out.println("Input: " + input[0] + ", " + input[1]);
                System.out.println("Target: " + target[0] + ", " + target[1]);
                System.out.println("Output: " + output[0] + ", " + output[1]);
                System.out.println(net.getRecentAverageError());
            }
            net.setFilePath("weights.txt");
            net.getIo().Write(net);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
