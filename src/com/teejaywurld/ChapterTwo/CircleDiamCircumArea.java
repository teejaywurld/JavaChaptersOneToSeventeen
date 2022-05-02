package com.teejaywurld.ChapterTwo;

import java.util.Scanner;

public class CircleDiamCircumArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of a circle here: ");
        int radius = scanner.nextInt();

        System.out.println();

        System.out.printf("The diameter of a circle is: %d%n", 2 * radius);
        System.out.printf("The circumference of a circle is: %.2f%n", 2 * Math.PI * radius);
        System.out.printf("The area of a circle is: %.2f%n", Math.PI * radius * radius);

        System.out.println();
    }
}
