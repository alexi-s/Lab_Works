package com;

public class Lab_1_6_1 {

    public static void main(String[] args) {

        // Create an array of all the even numbers from 2 to 30 (2,4,6...30)
        // and display elements of the array to the screen.

        int[] arr = new int[15];
        int count = 2;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count += 2;
        }

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
