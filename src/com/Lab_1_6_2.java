package com;

public class Lab_1_6_2 {

    public static void main(String[] args) {

        // There are statistics for the year by months as an array:
        // int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        // Write code which calculates the maximum value from the array, the minimum value and the average.

        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int min = m[0], max = m[0];
        float avg = 0;

        System.out.print("Array: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();

        for (int i : m) {
            if (i < min) {
                min = i;
            }
        }

        for (int i : m) {
            if (i > max) {
                max = i;
            }
        }

        for (int i : m) {
            avg += (float) i;
        }
        avg = avg / m.length;

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("Average value: " + avg);
    }
}
