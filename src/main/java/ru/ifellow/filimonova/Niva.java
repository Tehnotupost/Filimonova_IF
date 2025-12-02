package ru.ifellow.filimonova;

public class Niva extends Car {
    // Привод
    private String driveType;

    public Niva(String model, int year, String bodyType, String transmission, String color, String fuelType, String driveType) {
        super(model, year, bodyType, transmission, color, fuelType);
        this.driveType = driveType;
    }

    public String getDriveType() {

        return driveType;
    }

    @Override
    public String getFullInfo() {

        return super.getFullInfo() + "\nТип привода: " + driveType;
    }
}