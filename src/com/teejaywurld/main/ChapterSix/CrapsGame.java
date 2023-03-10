package com.teejaywurld.main.ChapterSix;

// TODO: A popular game of chance is a dice game known as craps. which is played in casinos and
//  back alleys throughout the world. The rules of the game are straightforward:
//      You role two dice, Each die has six faces, which contain one, two, three, four, five and
//      six spots, respectively. After the dice have come to rest, the sum of the spots on the two
//      upward faces is calculated. if the sum is 7 or 11 on the first throw, you win. If the sum is
//      2, 3 or 12 on the first throw (called craps), you lose (i.e., the "house" wins). If the
//      sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your "point." To win, you must
//      continue rolling the dice until you "make your point" (i.e., roll that same point value). You
//      lose by rolling a 7 before making your point.

import java.security.SecureRandom;

public class CrapsGame {

    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status { CONTINUE, WON, LOST };

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_ELEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON, LOST

        int sumOfDice = rollDice(); // first roll of the dice

        // determine game status and points based on first roll
        switch (sumOfDice){
            case SEVEN:
            case YO_ELEVEN:
                gameStatus = Status.WON;

            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;

            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Pont is %d%n", myPoint);
        }

        // while game is not complete
        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            // determine game status
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN)
                    gameStatus = Status.LOST;
        }

        // display won or lost message
        if (gameStatus == Status.WON)
            System.out.println("Player wins!");
        else
            System.out.println("Player loses **sad face** ");
    }

    // roll dice, calculate sum and display results
    private static int rollDice() {

        // pick random die value
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }
}
