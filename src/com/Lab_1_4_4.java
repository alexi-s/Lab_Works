package com;

public class Lab_1_4_4 {

    public static void main(String[] args) {

        // Write a console program that prints result of increment and decrement in prefix and postfix mode
        // for integer variable.

        int a = 10;

        System.out.println("Operation of increment");
        System.out.println("a = " + a + " - initial value");
        System.out.println("a = " + a++ + " - first print result, then operation of increment (postfix)");
        System.out.println("a = " + a + " - the value was changed");
        System.out.println("a = " + ++a + " - first increment, then print result (prefix)");

        System.out.println("\nOperation of decrement");
        a--;
        System.out.println("a = " + a + " - decrement");
        --a;
        System.out.println("a = " + a + " - decrement again");

    }
}
