package com.wornoffkeys;

public class Main {
    public static void main(String [] args) {
        int number = 50;

        do {
            System.out.println("Number: " + number);
            number--;
        } while(number < 0);

        System.out.println("Done!");
    }
}
