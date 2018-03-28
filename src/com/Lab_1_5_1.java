package com;

public class Lab_1_5_1 {
    public static void main(String[] args) {
        // Write a program to produce on console the following :
        // 1
        // 2  1
        // 3 2  1
        // 4 3 2  1
        // 5 4 3 2  1
        // 6 5 4 3 2  1
        // 7 6 5 4 3 2  1
        // 8 7 6 5 4 3 2  1

        int numIteration = 8;

        for (int i = 1; i <= numIteration; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}