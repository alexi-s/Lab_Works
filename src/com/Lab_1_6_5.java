package com;

import java.util.Arrays;
import java.util.Random;

public class Lab_1_6_5 {

    public static void main(String[] args) {

        // Write a program, which transpose matrix (2d arrays, size 4x4) and outputs it to the console,
        // use Arrays.toString(..)  to print to console

        Random rand = new Random();

        int size = 4;

        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }

        System.out.println("Original matrix:");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
