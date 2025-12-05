package ru.ifellow.filimonova.carbrand;
import lombok.Getter;
import lombok.Setter;
import ru.ifellow.filimonova.Car;
@Getter
@Setter

public class Uaz extends Car {

    private int payloadCapacity;

    public Uaz(String model, int year, String bodyType, String transmission, String color, String fuelType, int payloadCapacity) {
        super(model, year, bodyType, transmission, color, fuelType);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String getFullInfo() {

        return super.getFullInfo() + "\nГрузоподъемность: " + payloadCapacity + " кг";
    }
}