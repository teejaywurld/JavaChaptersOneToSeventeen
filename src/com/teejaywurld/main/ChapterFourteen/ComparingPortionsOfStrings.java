package com.teejaywurld.main.ChapterFourteen;

// TODO:-   (Comparing Portions of Strings) Write an application that uses String method regionMatches
//          to compare two strings input by the user. The application should input the number of
//          characters to be compared and the starting index of the comparison. The application should
//          state whether the strings are equal. Ignore the case of the characters when performing the
//          comparison.

import java.util.Scanner;

public class ComparingPortionsOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String 1: ");
        String s1 = scanner.nextLine();

        System.out.print("String 2: ");
        String s2 = scanner.nextLine();
        scanner.close();

        System.out.printf("The strings %s equal.", s1.regionMatches(true, 0, s2, 0, 2) ? "are" : "are not");
    }
}
