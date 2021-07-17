package oop;

public class Cars {

    double engineVolume, vihlop;
    String colourOfTheCar;
    CarsEnum carsEnum;



    public Cars(double engineVolume, String colourOfTheCar, CarsEnum carsEnum, double vihlop) {
        this.engineVolume = engineVolume;
        this.colourOfTheCar = colourOfTheCar;
        this.carsEnum = carsEnum;
        this.vihlop = vihlop;
    }

    void calculateVibrosi() {
        this.vihlop = this.vihlop * 0.25;
    }


}
