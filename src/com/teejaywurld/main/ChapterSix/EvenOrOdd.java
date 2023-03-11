package com.teejaywurld.main.ChapterSix;

// TODO:
//  (Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
//  whether an integer is even. The method should take an integer argument and return true
//  if the integer is even and false otherwise. Incorporate this method into an application
//  that inputs a sequence of integers (one at a time) and determines whether each is even
//  or odd.

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number here: ");
        int entry = scanner.nextInt();
        scanner.close();

        System.out.printf("%n%d being an even number is %s", entry, isEven(entry));
    }

    private static boolean isEven(int number){
        return number % 2 == 0; // ? true : false;
    }
}
