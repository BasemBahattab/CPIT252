package edu.kau.fcit.cpit252;

public class CarFactory {

    public CarInterface getClone(CarInterface car) {

        return car.makeCopy();
    }
}
