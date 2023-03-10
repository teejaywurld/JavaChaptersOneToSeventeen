package com.teejaywurld.main.ChapterSix;

// TODO:-
//  (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
//  hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
//  hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
//  longer than 24 hours at a time. Write an application that calculates and displays the parking charges
//  for each customer who parked in the garage yesterday. You should enter the hours parked for each
//  customer. The program should display the charge for the current customer and should calculate and
//  display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
//  the charge for each customer.

import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        ParkingCharges parkingCharges = new ParkingCharges();
        parkingCharges.calculateCharges();
    }

    public void calculateCharges(){
        double parkingHours = 0.0;
        double grossCharge = 0.0;
        double grossCharge1 = 0.0;
        double grossCharge2 = 0.0;
        double cummulativeGrossCharge = 0.0;

        Scanner scanner = new Scanner(System.in);

        while (parkingHours != -1){
            System.out.println();

            System.out.print("Enter your vehicle name: ");
            String vehicleName = scanner.next();

            System.out.println();

            System.out.print("Enter parking hours for your vehicle or -1 to terminate: ");
            parkingHours = scanner.nextDouble();

            System.out.println();

            if (parkingHours <= 3 && parkingHours > 0){
                grossCharge = 2.0;
                System.out.printf("The parking charge for your %s is $%.2f \n", vehicleName, grossCharge);
            }

            if (parkingHours > 3 && parkingHours < 19){
                grossCharge1 = 2.0 + (0.5 * (parkingHours - 3));
                System.out.printf("The parking charge for your %s is $%.2f \n", vehicleName, grossCharge1);
            }

            if (parkingHours >= 19 && parkingHours <= 24){
                grossCharge2 = 10;
                System.out.printf("The parking charge for your %s is $%.2f \n", vehicleName, grossCharge2);
            }

            if (parkingHours > 24){
                System.out.print("This parking hour is invalid");
                System.out.println();
            }
        }

        cummulativeGrossCharge += grossCharge + grossCharge1 + grossCharge2;
        System.out.printf("The total parking charges for all vehicles is $%.2f", cummulativeGrossCharge);

    }
}
