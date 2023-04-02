package com.teejaywurld.main.ChapterTen;

public class PayrollSystemTest {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Gregory", "Philips", "234-56-7890", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jayden", "Smith", "444-25-8888", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Idris", "Armstrong", "112-33-4321", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Jeffery", "James", "089-92-7675", 5000, .04, 300);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        for (Employee currentEmployee : employees){
            System.out.println(currentEmployee);

            // the method below is called downcasting
            if (currentEmployee instanceof BasePlusCommissionEmployee employee){
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }
    }
