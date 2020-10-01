package com.wornoffkeys;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        int inputOne = getNumberFromUser();
        int inputTwo = getNumberFromUser();

        int sum = add(inputOne, inputTwo);

        System.out.println("The sum is " + sum);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        return scanner.nextInt();
    }

    public static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
