package oop;

public class CarsMain {

    public static void main(String[] args) {
        Cars car1 = new Cars(2.5, "RED", CarsEnum.MERCEDES_BENZ, 0.25);
        System.out.println(car1.carsEnum);
        System.out.println(car1.colourOfTheCar);
        System.out.println(car1.engineVolume);

        car1.calculateVibrosi();
        System.out.println("eto i est vibrosi v atmosferu " + car1.vihlop);
        System.out.println("-----------------------------------------------------");

        Cars car2 = new Cars(3, "Black", CarsEnum.TOYOTA, 1);
        System.out.println(car2.carsEnum);
        System.out.println(car2.engineVolume);
        System.out.println(car2.colourOfTheCar);

        car2.calculateVibrosi();
        System.out.println("eto i est vibrosi v atmosferu " + car2.vihlop);
        System.out.println("-----------------------------------------------------");

        Cars car3 = new Cars(4.5, "Pearl", CarsEnum.SUBARU, 1.5);
        System.out.println(car3.carsEnum);
        System.out.println(car3.engineVolume);
        System.out.println(car3.colourOfTheCar);

        car3.calculateVibrosi();
        System.out.println("eto i est vibrosi v atmosferu " + car3.vihlop);
        System.out.println("-----------------------------------------------------");

        Cars car4 = new Cars(3.0, "white", CarsEnum.HUMMER, 0.5);
        System.out.println(car4.carsEnum);
        System.out.println(car4.engineVolume);
        System.out.println(car4.colourOfTheCar);


        car3.calculateVibrosi();
        System.out.println("eto i est vibrosi v atmosferu " + car4.vihlop);
    }


}
