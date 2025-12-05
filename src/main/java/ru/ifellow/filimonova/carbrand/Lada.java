package ru.ifellow.filimonova.carbrand;
import lombok.Getter;
import lombok.Setter;
import ru.ifellow.filimonova.Car;
@Getter
@Setter
public class Lada extends Car {

    private int doors;

    public Lada(String model, int year, String bodyType, String transmission, String color, String fuelType, int doors) {
        super(model, year, bodyType, transmission, color, fuelType);
        this.doors = doors;
    }

    @Override
    public String getFullInfo() {

        return super.getFullInfo() + "\nКоличество дверей: " + doors;
    }
}