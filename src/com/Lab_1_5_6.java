package com;

import java.util.Scanner;

public class Lab_1_5_6 {

    public static void main(String[] args) {

        // Write a program that calculates and displays the sum of squares of digits of number

        System.out.print("Enter number: ");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int temp = number;
        int digit = 0;
        int result = 0;

        while (temp != 0) {
            digit = temp % 10;
            result += digit * digit;
            temp = temp / 10;
        }
        System.out.println("result is: " + result);
    }
}
