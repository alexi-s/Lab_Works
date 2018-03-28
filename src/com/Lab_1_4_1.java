package com;

public class Lab_1_4_1 {

    public static void main(String[] args) {

        // Write a console program prints on console each of the primitive data types
        // (byte, short, int, long, float, double, char, boolean).

        byte b = -128;
        System.out.println("b = " + b);

        short s = 32001;
        System.out.println("s = " + s);

        int i = 1_000_000_000;
        System.out.println("i = " + i);

        long l = 2147483647L;
        System.out.println("l = " + l);

        float f = -1.0123456f;
        System.out.println("f = " + f);

        double d = 1.7e+30;
        System.out.println("d = " + d);

        char c = '\u004a';
        System.out.println("c = " + c);

        boolean bool = true;
        System.out.println("bool is " + bool);

    }
}