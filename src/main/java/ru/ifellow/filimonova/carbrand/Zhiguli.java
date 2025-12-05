package ru.ifellow.filimonova.carbrand;
import lombok.Getter;
import lombok.Setter;
import ru.ifellow.filimonova.Car;
@Getter
@Setter

public class Zhiguli extends Car {

    private int maxSpeed;

    public Zhiguli(String model, int year, String bodyType, String transmission, String color, String fuelType, int maxSpeed) {
        super(model, year, bodyType, transmission, color, fuelType);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getFullInfo() {

        return super.getFullInfo() + "\nМаксимальная скорость: " + maxSpeed + " км/ч";
    }
}