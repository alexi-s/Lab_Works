package com;

public class Lab_1_4_8 {

    public static void main(String[] args) {

        // Write a console program that prints result type casting for different primitive types.

        byte b = 127;
        short s = -280;
        int i;
        long l;
        float f;
        double d;

        i = b;
        System.out.println("i = " + i);
        b = (byte) (s / i);
        System.out.println("b = " + b);
        l = (long) ((i * i) << s);
        System.out.println("l = " + l);
        f = (float) (l * l);
        System.out.println("f = " + f);
        d = f * s;
        System.out.println("d = " + d);

    }
}
