package com.teejaywurld.main.ChapterFourteen;

// TODO:- (Comparing Strings) Write an application that uses String method compareTo to compare
//        two strings input by the user. Output whether the first string is less than, equal to
//        or greater than the second.

import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First entry: ");
        String s1 = scanner.nextLine();

        System.out.print("Second entry: ");
        String s2 = scanner.nextLine();
        scanner.close();

        int valueEquals = s1.compareTo(s2);

        if (valueEquals == 0)
            System.out.printf("%s is equal to %s", s1, s2);
        else if (valueEquals > 0)
            System.out.printf("%s is greater than %s", s1, s2);
        else
            System.out.printf("%s is less than %s", s1, s2);
    }
}
