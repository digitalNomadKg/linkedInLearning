package employee;

import java.util.Scanner;

public class EmployeeMain {


    public static void main(String[] args) {

        Employee employee1 = new Employee("", "", "", 0, 0);
        employee1.setFirstName("Tim");
        employee1.setLastName("Kirves");
        employee1.setAge(30);
        employee1.setLocation("Tallinn");

        System.out.println("Hello,");
        System.out.println(employee1.getFirstName() + ", " + employee1.getLastName() + ": from " + employee1.getLocation());

        System.out.println(employee1.taxCalculation());

        System.out.println("---------------------------------");
        Employee employee2 = new Employee("", "", "", 0, 0);
        employee2.setFirstName("Alebna");
        employee2.setLastName("Hvalnia");
        employee2.setAge(95);
        employee2.setLocation("Macedonia");

        System.out.println("Hello,");
        System.out.println(employee2.getFirstName() + ", " + employee2.getLastName() + ": from " + employee2.getLocation());

        System.out.println(employee2.taxCalculation());

    }
}
