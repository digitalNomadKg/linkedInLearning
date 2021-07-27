package oop.polymorphism;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.listOfAnimals.add("dog");
        animal.listOfAnimals.add("cat");
        animal.listOfAnimals.add("cow");
        animal.listOfAnimals.add("donkey");
        System.out.println(animal.listOfAnimals);

        System.out.println("-----------------");

        // With dog used arraylist
        Dog dog = new Dog();
        dog.setTypeOfAnimal("Domestic");
        dog.setNameOfAnimal("BimBim");
        dog.animalSound();
        System.out.println(dog.getNameOfAnimal() + " is " + dog.getTypeOfAnimal());
        dog.type.add("Husky");
        dog.type.add("Pitbull");
        dog.type.add("Dobermann");
        dog.type.add("Rottweiler");
        dog.type.add("Golden Retriever");
        System.out.println(dog.type);
        System.out.println(dog.getNameOfAnimal() + " is a - " + dog.type.get(0));

        dog.type.set(3, "Mawka Kuchuk");
        System.out.println(dog.getNameOfAnimal() + " is now a " + dog.type.get(3));
        dog.type.remove(3);
        System.out.println(dog.type);
        dog.type.remove(0);
        System.out.println(dog.type);

        System.out.println("-----------------");

        // With cat used arrays
        Cat cat = new Cat();
        cat.setTypeOfAnimal("Domestic");
        cat.setNameOfAnimal("Murzik");
        cat.animalSound();
        System.out.println(cat.getTypeOfAnimal());
        System.out.println(cat.getNameOfAnimal() + " is a " + cat.typeOfCat[1]);
        System.out.println(cat.typeOfCat.length);
        cat.lookForTypeOfCat();
        System.out.println(cat.typeOfCat[1]);


        System.out.println("-----------------");

        // With donkey used linkedlist
        Donkey donkey = new Donkey();
        donkey.setTypeOfAnimal("Domestic");
        donkey.setNameOfAnimal("IWAK");
        donkey.animalSound();
        System.out.println(donkey.getTypeOfAnimal());


    }
}
