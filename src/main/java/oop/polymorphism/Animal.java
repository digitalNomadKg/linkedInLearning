package oop.polymorphism;

import java.util.ArrayList;

public class Animal {

    private String typeOfAnimal, nameOfAnimal;


    public void animalSound() {
        System.out.println("Animal is making sound");
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    protected ArrayList<String> listOfAnimals = new ArrayList<String>();

}
