package com.teejaywurld.main.ChapterThree;

import java.util.Scanner;

public class InvoiceClassDriver {
    public static void main(String[] args) {

        System.out.println();

        InvoiceClass invoiceClass = new InvoiceClass("21134", "Online Store", 28, 10500.50);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kindly enter the number of your item here: ");
        String input = scanner.nextLine();

        System.out.print("Kindly enter the description of your item here: ");
        String type = scanner.nextLine();

        System.out.println("Enter the quantity of your item purchased here: ");
        int bought = scanner.nextInt();

//        System.out.println("Number" + "\t\t" + "Description" +  "\t\t" + "Sales Quantity" + "\t\t\t"  + "Price");



    }
}
