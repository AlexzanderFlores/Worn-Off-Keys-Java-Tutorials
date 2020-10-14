package com.wornoffkeys;

public class Main {
    public static void main(String [] args) {
        // Primitive types
        // byte
        // short
        // int
        // long

        // float
        // double

        // boolean
        // char

//        int number = 50;
//        subtract20(number);

        // Reference types
        int [] numbers = new int [] { 20, 30, 40 };
        printArray(numbers);
        subtract10FromAll(numbers);
        printArray(numbers);
    }

    public static void subtract20(int someNumber) {
        someNumber -= 20;
    }

    public static void subtract10FromAll(int [] someArray) {
        for (int a = 0; a < someArray.length; ++a) {
            someArray[a] = someArray[a] - 10;
        }
    }

    public static void printArray(int [] someArray) {
        for (int number : someArray) {
            System.out.println(number);
        }

        System.out.println("\n\n");
    }
}
