package com.dmdev.practice.garage.cars;

import com.dmdev.practice.garage.eums.Brand;
import com.dmdev.practice.garage.eums.Color;
import com.dmdev.practice.garage.eums.Model;

import java.util.Objects;

public class RaceCar extends Car{
    private int maxSpeed;

    public RaceCar(Brand label, Model model, int year, Color colour, int maxSpeed) {
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
