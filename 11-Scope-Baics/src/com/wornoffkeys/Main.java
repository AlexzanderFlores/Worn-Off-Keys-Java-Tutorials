package com.wornoffkeys;

public class Main {
    public static void main(String [] args) {
        int number = 50;

        if (true) {
            System.out.println(number);

            int anotherNumber = 100;
            System.out.println(anotherNumber);

            if (anotherNumber == 100) {
                System.out.println(anotherNumber);

                if (anotherNumber == 50) {
                    System.out.println(anotherNumber);
                }
            }
        }

//        System.out.println(anotherNumber);
    }
}
