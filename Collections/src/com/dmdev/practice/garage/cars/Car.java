package com.dmdev.practice.garage.cars;

import com.dmdev.practice.garage.eums.Brand;
import com.dmdev.practice.garage.eums.Color;
import com.dmdev.practice.garage.eums.Model;

import java.util.Objects;

public class Car {
    private Brand brand;
    private Model model;
    private int year;
    private Color colour;

    public Car(Brand brand, Model model, int year, Color colour) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(colour, car.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, colour);
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Color getColour() {
        return colour;
    }
}
