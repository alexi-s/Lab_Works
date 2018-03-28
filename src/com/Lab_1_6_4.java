package com;

import java.util.Scanner;

public class Lab_1_6_4 {

    public static void main(String[] args) {

        // Write a program, which uses a binary search in a sorted array of integer numbers to find a certain element.

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("What number to find: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number < arr[0] || number > arr[arr.length - 1]) {
            System.out.println("Element is not in array");
            return;
        }

        int lowIndex = 0, highIndex = arr.length, curIndex = 0;
        int counter = 0;

        while (lowIndex < highIndex) {
            counter++;
            curIndex = (lowIndex + highIndex) / 2;
            if (number == arr[curIndex]) {
                break;
            }
            if (number < arr[curIndex]) {
                highIndex = curIndex;
            } else {
                lowIndex = curIndex + 1;
            }
        }
        System.out.println("Number was found on iteration " + counter + ", position in array is " + curIndex);
    }
}
