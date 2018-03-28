package com;

import java.util.Scanner;

public class Lab_1_5_7 {

    public static void main(String[] args) {

        // Write a program that find and displays all perfect numbers from 1 to n
        // (perfect number is a positive integer that is equal to the sum of its proper positive divisors,
        // excluding the number itself).

        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum;

        for (int i = 1; i <= number; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
