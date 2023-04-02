package com.teejaywurld.main.ChapterEight;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final Date birthDate;
    private final Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString(){
        return String.format("%s %s was hired on: %s. Birthday is: %s", firstName, lastName, birthDate, hireDate);
    }
}
