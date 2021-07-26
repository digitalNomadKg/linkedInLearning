package oop.bankingApplication;

public class Main {


    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Tim Kirves", 0);


        bankAccount.setBalance(1500);
        bankAccount.withdraw(1254);
        bankAccount.deposit(0);
        bankAccount.withdraw(236);

        System.out.println(bankAccount.getWelcome());
        System.out.println(bankAccount.getClient()+" "+bankAccount.getBalance());

        bankAccount.deposit(5);
        bankAccount.withdraw(9);

        System.out.println(bankAccount.getClient()+" "+bankAccount.getBalance());

    }
}
