package ru.ifellow.filimonova;

import java.util.List;

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

    public static void printCarsAfter2006(List<Car> cars) {
        for (Car car : cars) {
            System.out.println("---");
            if (car.getYear() > 2006) {
                System.out.println(car.getFullInfo());
            } else {
                System.out.println("устаревший авто");
            }
        }
    }
    public static void changeGreenToRed(List<Car> cars) {
        for (Car car : cars) {
            if ("Зеленый".equals(car.getColor())) {
                car.setColor("Красный");
            }
        }
    }
    public static void upgradeEngine(List<Car> cars) {
            for (Car car : cars) {
                if (car.getYear() > 2015 && !"Бензин".equals(car.getFuelType())) {
                    car.setFuelType("Гибрид");
                }
            }
        }
}