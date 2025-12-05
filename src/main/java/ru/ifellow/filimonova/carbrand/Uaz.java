package ru.ifellow.filimonova.carbrand;

import ru.ifellow.filimonova.Car;

public class Uaz extends Car {

    private int payloadCapacity;

    public Uaz(String model, int year, String bodyType, String transmission, String color, String fuelType, int payloadCapacity) {
        super(model, year, bodyType, transmission, color, fuelType);
        this.payloadCapacity = payloadCapacity;
    }

    public int getPayloadCapacity() {

        return payloadCapacity;
    }

    @Override
    public String getFullInfo() {

        return super.getFullInfo() + "\nГрузоподъемность: " + payloadCapacity + " кг";
    }
}