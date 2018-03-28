package com;

public class Lab_1_4_3 {

    public static void main(String[] args) {
        // Write a console program that prints result of each of arithmetic logical (AND, OR, NOT, XOR)
        // for two variables of boolean data type.

        //          AND OR  XOR
        //  0 0     0   0   0
        //  0 1     0   1   1
        //  1 0     0   1   1
        //  1 1     1   1   0

        boolean a = true, b = false;

        System.out.println("a = " + a);
        System.out.println("b = " + b + '\n');

        System.out.println("AND\t" + (a && b));
        System.out.println("OR\t" + (a || b));
        System.out.println("NOT\t" + (a != b));
        System.out.println("XOR\t" + (a ^ b) + '\n');

        System.out.println("a XOR 1\t" + (a ^ true));

    }
}

