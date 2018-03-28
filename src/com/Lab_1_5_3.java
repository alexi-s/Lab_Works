package com;

public class Lab_1_5_3 {

    public static void main(String[] args) {
        // Write a program to produce the multiplication table of 1 to 9
        // using two nested for-loops

        System.out.println("*\t| \t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9");
        System.out.println("--------------------------------------------");


        for (int i = 1; i <=9 ; i++) {
            for (int j = 0; j <= 9 ; j++) {
                if (j == 0) {
                    System.out.print(i + "\t|\t");
                } else {
                    System.out.print(i * j + "\t");
                }
            }
            System.out.println();
        }
    }
}
