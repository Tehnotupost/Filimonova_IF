package ru.ifellow.filimonova.carbrand;
import lombok.Getter;
import lombok.Setter;
import ru.ifellow.filimonova.Car;
@Getter
@Setter

public class Niva extends Car {
    // Привод
    private String driveType;

    public Niva(String model, int year, String bodyType, String transmission, String color, String fuelType, String driveType) {
        super(model, year, bodyType, transmission, color, fuelType);
        this.driveType = driveType;
    }

    @Override
    public String getFullInfo() {

        return super.getFullInfo() + "\nТип привода: " + driveType;
    }
}