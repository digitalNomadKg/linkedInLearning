package oop.polymorphism.phoneBook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneBook {

    private String fullName, email;
    private int phoneNumber;
    protected String welcome = "Welcome";

    public PhoneBook(String fullName, String email, int phoneNumber) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    Scanner scanner = new Scanner(System.in);

    public void addingUserContact() {
        ArrayList<Object> ara = new ArrayList<Object>();

        System.out.println("Please add name of contact you want to save: ");
        ara.add(scanner.nextLine().toUpperCase());

        System.out.println("Please add your phone number: ");
        ara.add(scanner.nextInt());


        System.out.println("Please add email address: ");
        ara.add(scanner.next().toUpperCase());
        System.out.println("Contact created: " + ara);

    }

}




 














