package com;

public class Lab_1_6_3 {

    public static void main(String[] args) {

        // Write a program, which creates square matrix and prints them formatted to the console.
        // The size of the matrix is 4 x 4

        int[][] array = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
