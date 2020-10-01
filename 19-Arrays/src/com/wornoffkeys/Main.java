package com.wornoffkeys;

public class Main {
    public static void main(String [] args) {
        int numberOne = 50;
        int numberTwo = 75;
        int numberThree = 100;

        int [] ages = new int [5];
        ages[0] = 100;
        ages[1] = 101;
        ages[2] = 102;
        ages[3] = 103;
        ages[4] = 104;

        int [] numbers = new int [] { 50, 75, 100 };
        // 0 = 50
        // 1 = 75
        // 2 = 100

        numbers[1] = 500;

//        for (int counter = 0; counter < numbers.length; ++counter) {
//            int number = numbers[counter];
//            System.out.println(number);
//        }

//        for (int number : numbers) {
//            System.out.println(number);
//        }

        String [] names = new String [] {
                "Alex",
                "Alexzander"
        };

        printNames(names);
    }

    public static void printNames(String [] names) {
        for (String someName : names) {
            System.out.println("Name: \"" + someName + "\"");
        }
    }
}
