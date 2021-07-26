package oop.employee;

import java.util.Scanner;

public class Employee {
    private String firstName, lastName, location;
    private int age;
    private String message = "Please enter your salary: ";
    private double salary;

    Scanner scanner = new Scanner(System.in);

    public Employee(String firstName, String lastName, String location, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.age = age;
        this.salary = salary;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    double taxCalculation() {
        System.out.println(message);
        double userSalaryInput = scanner.nextDouble();
        if (userSalaryInput >= 1500) {
            double salaryTax = userSalaryInput * 0.2;
            System.out.println("This is your tax: " + salaryTax);
            salary = userSalaryInput - salaryTax;
            System.out.println("This is your nett salary: " + salary);
        } else {
            System.out.println("The salary is less then expected, no tax deduction");

        }
        System.out.print("Total: ");
        return userSalaryInput;
    }
}