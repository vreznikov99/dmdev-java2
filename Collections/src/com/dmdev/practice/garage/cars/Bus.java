package com.dmdev.practice.garage.cars;

import java.util.Objects;

public class Bus extends Car{
    private int peopleCapacity;

    public Bus(String label, String model, int year, String colour, int peopleCapacity) {
        super(label, model, year, colour);
        this.peopleCapacity = peopleCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "peopleCapacity=" + peopleCapacity +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return peopleCapacity == bus.peopleCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), peopleCapacity);
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }
}
