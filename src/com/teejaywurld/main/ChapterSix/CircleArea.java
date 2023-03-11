package com.teejaywurld.main.ChapterSix;

//  TODO:
//      (Circle Area) Write an application that prompts the user for the radius of a circle and uses
//      a method called circleArea to calculate the area of the circle.

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of a circle here: ");
        double radius = scanner.nextDouble();

        System.out.println();

        System.out.printf("The circle of an area is %,.2fcm²", circleArea(radius));
        scanner.close();
    }

    private static double circleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}
