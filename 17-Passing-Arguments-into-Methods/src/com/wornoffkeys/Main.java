package com.wornoffkeys;

public class Main {
    public static void main(String [] args) {
//        String name = "Alex";
//        int age = 27;
//        sayHello(name, age);
//        System.out.println("Test");

        printNumbers();
        printNumbers(5, 10, 15, 20, 25);
        printNumbers(5, 10, 15, 20, 25, 30, 45,45,4353,54,54,543,6547,567,56,56,32,423);
    }

    public static void sayHello(String name, int age) {
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old");
    }

    public static void printNumbers(int ... numbers) {
        for (int counter = 0; counter < numbers.length; ++counter) {
            System.out.println("Number: " + numbers[counter]);
        }
    }
}
