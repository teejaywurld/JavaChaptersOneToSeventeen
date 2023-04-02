package com.teejaywurld.main.ChapterEight;

public class EmployeeTest {

    public static void main(String[] args) {

        Date birth = new Date(24, 7, 1950);
        Date hire = new Date(3, 12, 1980);
        Employee employee = new Employee("Adetunji", "Henry", birth, hire);

        System.out.println(employee);
    }
}
