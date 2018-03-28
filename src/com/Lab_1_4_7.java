package com;

import java.util.Scanner;

public class Lab_1_4_7 {

    public static void main(String[] args) {

        // Write a console program that prints result of Ternary operator for  integer variable initialization.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any integer value: ");
        int a = scan.nextInt();

        String resultStr = (a % 2) == 0 ? " is even" : " is odd";
        System.out.println(a + resultStr);

    }
}
