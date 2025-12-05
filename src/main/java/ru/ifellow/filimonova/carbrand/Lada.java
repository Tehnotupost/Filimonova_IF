package ru.ifellow.filimonova.carbrand;

import ru.ifellow.filimonova.Car;

public class Lada extends Car {

    private int doors;

    public Lada(String model, int year, String bodyType, String transmission, String color, String fuelType, int doors) {
        super(model, year, bodyType, transmission, color, fuelType);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String getFullInfo() {

        return super.getFullInfo() + "\nКоличество дверей: " + doors;
    }
}