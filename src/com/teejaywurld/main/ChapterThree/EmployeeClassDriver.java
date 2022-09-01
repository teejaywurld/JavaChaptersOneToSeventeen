package com.teejaywurld.main.ChapterThree;

public class EmployeeClassDriver {
    public static void main(String[] args) {

        System.out.println();

        EmployeeClass firstStaff = new EmployeeClass("Stephens", "Macaulay", 55_500.00);
        EmployeeClass secondStaff = new EmployeeClass("Sandra", "Holmes", 48_900.00);

        System.out.println();

        System.out.println("Find Employees Current Salary Structure below: ");
        System.out.println();

        System.out.println("\t" + firstStaff.getFirstName() + " " + firstStaff.getLastName() + "'s monthly salary = $" + firstStaff.getMonthlySalary());
        System.out.println("\t" + secondStaff.getFirstName() + " " + secondStaff.getLastName() + "'s monthly salary = $" + secondStaff.getMonthlySalary());

        System.out.println();
        System.out.println("\t\t\t\t\t while");
        System.out.println();

        System.out.println("\t" + firstStaff.getFirstName() + " " + firstStaff.getLastName() + "'s yearly salary = $" + firstStaff.getMonthlySalary());
        System.out.println("\t" + secondStaff.getFirstName() + " " + secondStaff.getLastName() + "'s yearly salary = $" + secondStaff.getMonthlySalary());

        System.out.println();

        //formula to add 10% raise to employees' monthly salary each
        firstStaff.setMonthlySalary(firstStaff.getMonthlySalary() * 1.1 * 12 );
        secondStaff.setMonthlySalary(secondStaff.getMonthlySalary() * 1.1 * 12);

        System.out.println("Sir, Find Employees New Salary Structure after 10% raise below: ");
        System.out.println();
        System.out.println("\t" + firstStaff.getFirstName() + " " + firstStaff.getLastName() + "'s new yearly salary = $" + firstStaff.getMonthlySalary());
        System.out.println("\t" + secondStaff.getFirstName() + " " + secondStaff.getLastName() + "'s new yearly salary = $" + secondStaff.getMonthlySalary());

        System.out.println();
    }
}
