package ru.ifellow.filimonova;
import ru.ifellow.filimonova.carbrand.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ru.ifellow.filimonova.caractions.*;

public class Main {
    //Правильно
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

        int actionNumber = 0;
        Scanner scan = new Scanner(System.in);
        while (actionNumber < 7) {
            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("Показать все автомобили в наличии: 1");
            System.out.println("Показать все автомобили определенного типа кузова: 2");
            System.out.println("Показать все автомобили определенного типа КПП: 3");
            System.out.println("Показать автомобили, выпущенные после определенного года: 4");
            System.out.println("Изменить цвет автомобиля: 5");
            System.out.println("Изменить тип топлива: 6");
            System.out.println("Завершить программу: 7");
            System.out.println();
            System.out.println("Введите число");
            actionNumber = scan.nextInt();

        switch (actionNumber) {
            case 1 -> {
                System.out.println("Список автомобилей:");
                for (Car car : cars) {
                 System.out.println("---");
                 System.out.println(car.getFullInfo());
                }
            }
            case 2 -> printCarsBodyType(cars);
            case 3 -> printCarsTransmission(cars);
            case 4 -> printCarsAfterAnyEar(cars);
            case 5 -> changeAnyColor(cars);
            case 6 -> {
                upgradeEngine(cars);
                System.out.println("\nАвтомобили после смены типа топлива:");
                for (Car car : cars) {
                    System.out.println("---");
                    System.out.println(car.getFullInfo());
                }

            }
        }
        }
    }
}