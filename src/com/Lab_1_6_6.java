package com;

import java.util.Arrays;

public class Lab_1_6_6 {

    public static void main(String[] args) {

        // Write a program that sorts an array of average temperature values by months of 2015  as follows:
        // at first the negative values, then - positive values

        int[] avgTArray = {-6, -8, -4, 4, 12, 22, 24, 23, 19, 9, 5, 0};
        int[] sortedArray = new int [12];

        System.out.println("Original array: \t\t\t\t" + Arrays.toString(avgTArray));

        System.arraycopy(avgTArray, 0, sortedArray, 0, avgTArray.length);
        Arrays.sort(sortedArray);
        System.out.println("Sorted array (Arrays.sort()): \t" + Arrays.toString(sortedArray));

        System.arraycopy(avgTArray, 0, sortedArray, 0, avgTArray.length);
        for(int i = sortedArray.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted array (Bubble sort): \t" + Arrays.toString(sortedArray));

    }
}
