package com.teejaywurld.main.ChapterFourteen;

import java.util.Scanner;

public class ValidateInputTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your home address:");
        String homeAddress = scanner.nextLine();

        System.out.println("Please enter your city:");
        String city = scanner.nextLine();

        System.out.println("Please enter your state:");
        String state = scanner.nextLine();

        System.out.println("Please enter your country:");
        String country = scanner.nextLine();

        System.out.println("Please enter your zip code:");
        String zipCode = scanner.nextLine();

        System.out.println("Please enter your phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println();

        System.out.println("Validated Result:");

        if (!ValidateInput.validateFirstName(firstName))
            System.out.println("Invalid first name entered");
        else if (!ValidateInput.validateLastName(lastName))
            System.out.println("Invalid last name entered");
        else if (!ValidateInput.validateHomeAddress(homeAddress))
            System.out.println("Invalid home address entered");
        else if (!ValidateInput.validateCity(city))
            System.out.println("Invalid city entered");
        else if (!ValidateInput.validateState(state))
            System.out.println("Invalid state entered");
        else if (!ValidateInput.validateCountry(country))
            System.out.println("Invalid country entered");
        else if (!ValidateInput.validateZipCode(zipCode))
            System.out.println("Invalid zip code entered");
        else if (!ValidateInput.validatePhone(phoneNumber))
            System.out.println("Invalid phone number entered");
        else
            System.out.println("Your entries are valid. Thank you");
    }
}
