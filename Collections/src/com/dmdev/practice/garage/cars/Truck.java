package com.dmdev.practice.garage.cars;

import java.util.Objects;

public class Truck extends Car{
    private int loadCapacity;

    public Truck(String label, String model, int year, String colour, int loadCapacity) {
        super(label, model, year, colour);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
