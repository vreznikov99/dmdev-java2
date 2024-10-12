package com.dmdev.homework1;

import java.util.Arrays;

/**
 * Каждый дом содержит свой номер (int), и множество этажей (массив).
 */
public class House {
    private int houseNumber;
    private Floor[] floors;

    public House(int number, Floor[] floors) {
        this.houseNumber = number;

        this.floors = floors;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print(){
        System.out.println("House number: " + houseNumber + " Floor amount: " + floors.length);
    }

}
