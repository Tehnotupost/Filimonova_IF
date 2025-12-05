package ru.ifellow.filimonova.carbrand;

import ru.ifellow.filimonova.Car;

public class Moskvitch extends Car {

    private double engineVolume;

    public Moskvitch(String model, int year, String bodyType, String transmission, String color, String fuelType, double engineVolume) {
        super(model, year, bodyType, transmission, color, fuelType);
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {

        return engineVolume;
    }

    @Override
    public String getFullInfo() {

        return super.getFullInfo() + "\nОбъем двигателя: " + engineVolume + " л";
    }
}