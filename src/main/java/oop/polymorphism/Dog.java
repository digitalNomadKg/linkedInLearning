package oop.polymorphism;


import java.util.ArrayList;

public class Dog extends Animal {

    protected ArrayList<String> type = new ArrayList<String>();

    public void animalSound() {
        System.out.println(getNameOfAnimal() + " is barking");
    }
}







