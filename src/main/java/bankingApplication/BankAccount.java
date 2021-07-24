package bankingApplication;

import java.util.Date;
import java.util.Scanner;

public class BankAccount {

    private String client;
    private double balance;
    private Date executionDate;
    private String welcome = "Welcome,";

    Scanner scanner = new Scanner(System.in);

    public BankAccount(String client, double balance) {
        this.client = client;
        this.balance = balance;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String getWelcome() {
        return welcome;
    }


    public double increaseBalance() {
        System.out.println("Please enter amount you want to add: ");
        double income = scanner.nextDouble();


        while (income <= 0) {
            System.out.println("Amount is not correct, please check amount and try again");
             income = scanner.nextDouble();
        }
        System.out.print("Your balance now is: ");
        return income + balance;
    }
}
