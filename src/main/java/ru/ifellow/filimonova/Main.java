package ru.ifellow.filimonova;
import java.util.ArrayList;
import java.util.List;

import static ru.ifellow.filimonova.Car.*;

public class Main {
    //it's hotfix origin
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Lada("Aura", 2025, "Седан", "Автоматическая", "Черный", "Бензин", 5));
        cars.add(new Lada("2109", 1990, "Лифтбек", "Механическая", "Белый", "Бензин", 5));

        cars.add(new Niva("Legend", 2021, "Внедорожник", "Механическая", "Красный", "Бензин", "4WD"));
        cars.add(new Niva("Travel", 2020, "Внедорожник", "Механическая", "Серебристый", "Бензин", "FWD"));

        cars.add(new Zhiguli("2107", 1999, "Седан", "Механическая", "Белый", "Бензин", 156));
        cars.add(new Zhiguli("2112", 2008, "Хэтчбек", "Механическая", "Мокрый асфальт", "Бензин", 205));

        cars.add(new Moskvitch("2141", 1993, "Седан", "Механическая", "Белый", "Бензин", 2.5));
        cars.add(new Moskvitch("2140", 1988, "Хэтчбек", "Механическая", "Красный", "Бензин", 2.0));

        cars.add(new Uaz("Patriot", 2022, "Пикап", "Автоматическая", "Оранжевый", "Бензин", 2700));
        cars.add(new Uaz("Hanter", 2010, "Внедорожник", "Механическая", "Зеленый", "Дизель", 655));

        System.out.println("Список автомобилей:");
        for (Car car : cars) {
            System.out.println("---");
            System.out.println(car.getFullInfo());
        }
        System.out.println("\nАвтомобили, выпущенные после 2006 года:");
        printCarsAfter2006(cars);

        changeGreenToRed(cars);

        System.out.println("\nПерекрашенные втомобили:");
        for (Car car : cars) {
            System.out.println("---");
            System.out.println(car.getFullInfo());
        }

        upgradeEngine(cars);

        System.out.println("\nАвтомобили после апгрейда двигателя:");
        for (Car car : cars) {
            System.out.println("---");
            System.out.println(car.getFullInfo());
        }
    }
}