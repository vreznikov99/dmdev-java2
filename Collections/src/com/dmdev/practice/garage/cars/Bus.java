package com.dmdev.practice.garage.cars;

import com.dmdev.practice.garage.eums.Brand;
import com.dmdev.practice.garage.eums.Color;
import com.dmdev.practice.garage.eums.Model;

import java.util.Objects;

public class Bus extends Car{
    private int peopleCapacity;

    public Bus(Brand label, Model model, int year, Color colour, int peopleCapacity) {
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
