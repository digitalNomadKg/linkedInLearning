package oop.polymorphism.phoneBook;

public class Main {


    public static void main(String[] args) {
        PhoneBook user = new User(" ", " ", 0);

        System.out.println(user.welcome);

        user.addingUserContact();

    }
}
