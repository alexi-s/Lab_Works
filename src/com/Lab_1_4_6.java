package com;

public class Lab_1_4_6 {

    public static void main(String[] args) {

        // Write a console program that prints result of Bitwise operators for two integer variables.

        int a = 0b0010; // 2
        int b = 0b0101; // 5

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~ a = " + ~ a);
        System.out.println("~ b = " + ~ b);
        System.out.println("b << a = " + (b << a));
        System.out.println("b >> a = " + (b >> a));

    }
}
