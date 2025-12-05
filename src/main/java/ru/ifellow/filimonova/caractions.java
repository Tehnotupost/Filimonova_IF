package ru.ifellow.filimonova;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class caractions {

    public static void printCarsBodyType(List<Car> cars) { //2
        String anyBodyType;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите тип кузова");
        anyBodyType = scan.nextLine();
        boolean found = false;
        for (Car car : cars) {
            if (anyBodyType.equalsIgnoreCase(car.getBodyType())) {
                System.out.println("---");
                System.out.println(car.getFullInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("не найдено");
        }
    }
    public static void printCarsTransmission(List<Car> cars) { //3
        int anyTransmissionNumber;
        String anyTransmission;
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите тип коробки передач");
        System.out.println("Механическая: 1");
        System.out.println("Автоматическая: 2");
        anyTransmissionNumber = scan.nextInt();
        if (anyTransmissionNumber == 1) {
            anyTransmission = "Механическая";
        }else anyTransmission = "Автоматическая";
        boolean found = false;
        for (Car car : cars) {
            if (anyTransmission.equalsIgnoreCase(car.getTransmission())) {
                System.out.println("---");
                System.out.println(car.getFullInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("не найдено");
        }
    }
    public static void printCarsAfterAnyEar(List<Car> cars) {//4
        int anyEar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год выпуска");
        anyEar = scan.nextInt();
        System.out.println("Автомобили после " + anyEar + " года:");
        for (Car car : cars) {
            System.out.println("---");
            if (car.getYear() > anyEar) {
                System.out.println(car.getFullInfo());
            } else {
                System.out.println("устаревший авто");
            }
        }
    }
    public static void changeAnyColor(List<Car> cars) {//5
        String anyColorBefore;
        String anyColorAfter;
        Scanner scan = new Scanner(System.in);
        Set<String> uniqueColors = cars.stream()
                .map(Car::getColor)
                .collect(Collectors.toSet());
        System.out.println("\nМожно изменить следующие цвета:");
        uniqueColors.forEach(System.out::println);
        System.out.println("Введите цвет, который хотите изменить");
        anyColorBefore = scan.nextLine();
        System.out.println("Введите новый цвет");
        anyColorAfter = scan.nextLine();
        System.out.println("\nПокрашено:");
        for (Car car : cars) {
            System.out.println("---");
            if (anyColorBefore.equals(car.getColor())) {
                car.setColor(anyColorAfter);
                System.out.println(car.getFullInfo());
            } else {
                System.out.println("цвет не менялся");
            }
        }
    }
    public static void upgradeEngine(List<Car> cars) {//6
        String fuelTypeBefore;
        String fuelTypeAfter;
        Scanner scan = new Scanner(System.in);
        Set<String> uniqueFuelType = cars.stream()
                .map(Car::getFuelType)
                .collect(Collectors.toSet());
        System.out.println("\nМожно изменить следующие типы топлива:");
        uniqueFuelType.forEach(System.out::println);
        System.out.println("Введите тип топлива, который хотите изменить");
        fuelTypeBefore = scan.nextLine();
        System.out.println("Введите новый тип топлива");
        fuelTypeAfter = scan.nextLine();
        for (Car car : cars) {
            if (fuelTypeBefore.equals(car.getFuelType())) {
                    car.setFuelType(fuelTypeAfter);
            }else {
                System.out.println("тип топлива не менялся");
            }
        }
    }
}
