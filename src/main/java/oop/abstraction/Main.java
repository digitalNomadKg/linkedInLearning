package oop.abstraction;

public class Main {
    public static void main(String[] args) {

       LhvBank banker = new LhvBank("","",0);

       banker.setBalance(4500);
       banker.setTax("Estonia");
       banker.welcome();


    }
}
