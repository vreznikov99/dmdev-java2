package com.dmdev.homework1;

/**
 * Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 */

public class Floor {
    private int floor;
    private Flat[] flats;

    public Floor(int floors, Flat[] flats) {
        this.floor = floors;
        this.flats = flats;
    }

    public int getFloors() {
        return floor;
    }

    public void setFloors(int floors) {
        this.floor = floors;
    }

    public void print(){
        System.out.println("Floor number: " + this.floor + " Flats amount: " + flats.length);
    }

    public Flat[] getFlats() {
        return flats;
    }
}
