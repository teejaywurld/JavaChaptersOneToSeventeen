package com.teejaywurld.main.ChapterSix;

// TODO:
//  Define a method hypotenuse that calculates the hypotenuse of a right angle
//  triangle when the lengths of the other two sides are given. The method should
//  take two arguments of type double and return the hypotenuse as a double.
//  Incorporate this method into an application that reads values for side1 and
//  side2 and perform the calculation with the hypotenuse method. Use Math methods
//  pow and sqrt to determine the length of the hypotenuse for each of the triangles
//  in Fig. 6.15. [Class Math also provides method hypot to perform this calculation.]
//              Triangle: 1      Side 1: 3.0      Side2: 4.0
//              Triangle: 2      Side 1: 5.0      Side2: 12.0
//              Triangle: 3      Side 1: 8.0      Side2: 15.0

public class HypotenuseCalculations {
    public static void main(String[] args) {

        System.out.println(hypotenuse(3.0, 4.0));
        System.out.println(hypotenuseSecond(5.0, 12.0));
        System.out.println(hypotenuseThird(8.0, 15.0));
    }

    private static double hypotenuse(double side1, double side2){
        double hypotenuse; // = 0.0;
        double val1 = side1;
        double val2 = side2;

        for (int i = 1; i < 2 ; i++) {
            val1 *= side1;
            val2 *= side2;
        }

        hypotenuse = val1 + val2;
        return Math.sqrt(hypotenuse);
    }

    private static double hypotenuseSecond(double side1, double side2){
        double hypotenuse; // = 0.0;

        hypotenuse = Math.pow(side1, 2) + Math.pow(side2, 2);

        return Math.sqrt(hypotenuse);
    }

    private static double hypotenuseThird(double side1, double side2){
        double hypotenuse;

        hypotenuse = Math.pow(side1, 2) + Math.pow(side2, 2);

        return Math.sqrt(hypotenuse);
    }
}
