package com.teejaywurld.main.ChapterSix;

// TODO:
//  (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
//  second integer is a multiple of the first. The method should take two integer arguments and return
//  true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
//  Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
//  time) and determines whether the second value in each pair is a multiple of the first.

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first integer here: ");
        int firstInteger = scanner.nextInt();

        System.out.println();

        System.out.print("Enter your second integer here: ");
        int secondInteger = scanner.nextInt();

        scanner.close();

        System.out.printf("%n%d being a multiple of %d is %s", firstInteger, secondInteger, isMultiple(firstInteger, secondInteger));
    }

    private static boolean isMultiple(int firstNumber, int secondNumber){
        // return secondNumber % firstNumber == 0 ? true : false;
        return secondNumber % firstNumber == 0; // return statement simplified to return true or false
    }
}
