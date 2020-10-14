package com.wornoffkeys;

import java.util.Random;

public class Main {
    public static void main(String [] args) {
        // Max
//        int result = Math.max(100, 20);
//        System.out.println(result);

        // Min
//        int result = Math.min(20, 50);
//        System.out.println(result);

        // Sqrt
//        int result = (int) Math.sqrt(26);
//        System.out.println(result);

        // Abs
//        int result = Math.abs(-500);
//        System.out.println(result);

        // Random
//        double result = Math.random();
//        System.out.println(result);

        // Random number between two values
        int min = 1;
        int max = 5;

        int result = (int) (Math.random() * (max - min) + min);
        System.out.println(result);
    }
}
