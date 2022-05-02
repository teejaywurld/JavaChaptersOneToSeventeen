package com.teejaywurld.ChapterTwo;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Hi there! Enter your body weight here: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height here: ");
        double height = scanner.nextDouble();

        System.out.println();

        double BMI = weight / (height * height);

        if (BMI < 18.5){
            System.out.println("You are 'Underweight'");
        }

        if (BMI == 18.5 && BMI <= 24.9){
            System.out.println("Your Body Mass Index is 'Normal'");
        }

        if (BMI == 25 && BMI <= 29.9){
            System.out.println("Your Body Mass Index is 'Overweight'");
        }

        if (BMI >= 30){
            System.out.println("Friend, you are Obese. Work actively on your BMI");
        }
    }
}
