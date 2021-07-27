package oop.polymorphism;

public class Cat extends Animal {

    protected String[] typeOfCat = {"VAN", "Persian", "French CAT", "Sphinx"};

    protected String lookForTypeOfCat() {
        for (int i = 0; i < typeOfCat.length; i++) {
            System.out.println(typeOfCat[i]);
        }
        return "Here we go";
    }


    public void animalSound() {
        System.out.println(getNameOfAnimal() + " is meo meouing");
    }
}
