package com.wornoffkeys;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number != 10) {
            System.out.println("Your number was greater than 10");
        }
    }
}
