package com.teejaywurld.main.ChapterSix;

//  TODO:
//      (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to receive a second
//      parameter of type char called fillCharacter. Form the square using the char provided as an argument.
//      Thus, if side is 5 and fillCharacter is #, the method should display
//                  #####
//                  #####
//                  #####
//                  #####
//                  #####
//      Use the following statement (in which input is a Scanner object) to read a character from the user
//      at the keyboard: char fill = input.next().charAt(0);

import java.util.Scanner;

public class SquareOfAnyCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of a square: ");
        int side = scanner.nextInt();

        System.out.print("Enter a character: ");
        char fill = scanner.next().charAt(0);
        scanner.close();

        squareOfAsterisks(side, fill);

    }

    private static void squareOfAsterisks(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++)
                System.out.print(fillCharacter);

            System.out.println();
        }
    }
}
