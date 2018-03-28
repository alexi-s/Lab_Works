package com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab_1_6_7 {

    public static void main(String[] args) {

        // Write a program, which finds in a given matrix the area of equal numbers.

        final int ROWS = 4;
        final int COLS = 5;

        int[][] matrix = new int[ROWS][COLS];
        Random rand = new Random();

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                matrix[i][j] = rand.nextInt(5);
            }
        }
        for (int i = 0; i < ROWS; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        // find duplicates
        Scanner scan = new Scanner(System.in);
        System.out.print("Which number you want to find: ");
        int num = scan.nextInt();

        String resStr;
        for (int i = 0; i < ROWS; i++) {
            boolean flag = false;
            resStr = "";
            for (int j = 0; j < COLS; j++) {
                if (matrix[i][j] == num) {
                    resStr = resStr + j + " ";
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("Line " + (i + 1) + ": " + resStr);
            }
        }

    }
}
