package com.teejaywurld.main.ChapterThree;

public class EmployeeClass {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public EmployeeClass(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

}
