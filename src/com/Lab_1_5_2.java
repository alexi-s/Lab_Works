package com;

import java.util.Scanner;

public class Lab_1_5_2 {

    public static void main(String[] args) {
        // Write a program which prompts user for the number "x", reads it from the keyboard, and saves it in an int variable called "x".
        // Then prints "One", "Two",... , "Nine" if the variable "x" is 1, 2,... , 9 and "Other" if x >9, respectively.
        // Use: (a) a "nested-if" statement;
        //      (b) a "switch-case" statement.
        // The output shall look like (user input – in green):
        //        -Enter number x: 1	-Enter number x: 12
        //        -One					- Other

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = scan.nextInt();
        String resultString = "";

        switch (x) {
            case 1: {
                resultString = "One";
                break;
            }
            case 2: {
                resultString = "Two";
                break;
            }
            case 3: {
                resultString = "Three";
                break;
            }
            case 4: {
                resultString = "Four";
                break;
            }
            case 5: {
                resultString = "Five";
                break;
            }
            case 6: {
                resultString = "Six";
                break;
            }
            case 7: {
                resultString = "Seven";
                break;
            }
            case 8: {
                resultString = "Eight";
                break;
            }
            case 9: {
                resultString = "Nine";
                break;
            }
            default: {
                if (x > 9) {
                    resultString = "Other";
                }
            }
        }
        System.out.println(resultString);
    }
}
