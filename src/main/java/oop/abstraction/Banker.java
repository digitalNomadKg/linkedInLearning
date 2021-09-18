package oop.abstraction;

import java.util.Scanner;

public abstract class Banker {

    private String name, tax;
    private double balance;

    final Scanner scanner = new Scanner(System.in);


    public void welcome() {
        this.name = scanner.nextLine();
        System.out.println("Hello " + this.name + " your balance is " + this.balance);

    }

    public Banker(String name, String tax, double balance) {
        this.name = name;
        this.tax = tax;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
