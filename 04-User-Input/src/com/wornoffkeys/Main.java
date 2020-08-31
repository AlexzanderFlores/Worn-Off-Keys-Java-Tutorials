package com.wornoffkeys;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        System.out.println(age);
    }
}
