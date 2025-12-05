package ru.ifellow.filimonova;

public abstract class Car {
    protected String model;
    protected int year;
    protected String bodyType;
    protected String transmission;
    protected String color;
    protected String fuelType;

    public Car(String model, int year, String bodyType, String transmission, String color, String fuelType) {
        this.model = model;
        this.year = year;
        this.bodyType = bodyType;
        this.transmission = transmission;
        this.color = color;
        this.fuelType = fuelType;
}
    public String getFullInfo() {
        return "Модель: " + model + "\n" +
                "Год выпуска: " + year + "\n" +
                "Тип кузова: " + bodyType + "\n" +
                "Коробка передач: " + transmission + "\n" +
                "Цвет: " + color + "\n" +
                "Тип топлива: " + fuelType;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setFuelType(String newFuelType) {
        this.fuelType = newFuelType;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }
}