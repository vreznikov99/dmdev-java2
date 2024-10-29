package com.dmdev.practice.garage.cars;

import java.util.Objects;

public class RaceCar extends Car{
    private int maxSpeed;

    public RaceCar(String label, String model, int year, String colour, int maxSpeed) {
        super(label, model, year, colour);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "RaceCar{" +
                "maxSpeed=" + maxSpeed +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RaceCar raceCar = (RaceCar) o;
        return maxSpeed == raceCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
