package com.wornoffkeys;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch(input) {
            case "test":
                System.out.println("The word was test");
                break;

            case "testing":
                System.out.println("The word was testing");
                break;

            default:
                System.out.println("Unknown word");
                break;
        }
    }
}
