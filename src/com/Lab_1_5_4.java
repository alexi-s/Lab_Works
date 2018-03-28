package com;

public class Lab_1_5_4 {

    public static void main(String[] args) {
        // The program must print the first 10 numbers that is divisible evenly by 3 or 4,
        // but for loop iterates from 1 to 300 (so break statement must be used after 10 printed result).

        int counter = 0;

        for (int i = 1; i <= 300; i++) {
            if ((i % 3 == 0) || (i % 4 == 0)){
                System.out.println(i);
                counter++;
            }
            if (counter == 10) {
                break;
            }
        }
    }
}
