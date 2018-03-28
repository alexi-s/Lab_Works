package com;

import java.util.Scanner;

public class Lab_1_5_5 {

    public static void main(String[] args) {

        // Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
        // Also compute and display the average.
        // The output shall look like:
        // The Sum is: 100
        // The Avg is: 10

        System.out.print("Enter number of numeric to count sum: ");

        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += i;
        }

        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + (float) sum / count);

    }
}
