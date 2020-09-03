package com.wornoffkeys;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 50) {
            System.out.println("The number is 50!");
        } else if (number == 60) {
            System.out.println("60!");
        } else if (number == 70) {
            System.out.println("70!");
        } else {
            System.out.println("Unknown number");
        }

        if (number == 700) {
            System.out.println("700!");
        }
        else if (number == 800) {
            System.out.println("800");
        }
    }
}
