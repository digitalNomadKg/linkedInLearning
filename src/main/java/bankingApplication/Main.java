package bankingApplication;

import java.util.Date;

public class Main {




    public static void main(String[] args) {

    BankAccount bankAccount =  new BankAccount("Tim", 15);


        System.out.println(bankAccount.getWelcome() + " "+ bankAccount.getClient() + " Your account balance is: "
                + bankAccount.getBalance());

        System.out.println(bankAccount.increaseBalance());



    }
}
