package com.teejaywurld.main.ChapterTen;

// TODO: Case Study: Payroll System Using Polymorphism
//      A company pays its employees on a weekly basis. The employees are of four types: Salaried
//      employees are paid a fixed weekly salary regardless of the number of hours worked, hourly
//      employees are paid by the hour and receive overtime pay (i.e., 1.5 times their hourly salary
//      rate) for all hours worked in excess of 40 hours, commission employees are paid a percentage
//      of their sales and base-salaried commission employees receive a base salary plus a percentage
//      of their sales. For the current pay period, the company has decided to reward salaried-commission
//      employees by adding 10% to their base salaries. The company wants you to write an application
//      that performs its payroll calculations polymorphically.

public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earnings();
}
