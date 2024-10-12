package com.dmdev.homework1;

/**
 * Каждая квартира содержит свой номер (int), и множество комнат (массив).
 */
public class Flat {
    private int flat;
    private Room[] rooms;

    public Flat(int flat, Room[] rooms) {
        this.flat = flat;
        this.rooms = rooms;
    }

    public int getFlats() {
        return flat;
    }

    public void setFlats(int flats) {
        this.flat = flats;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print(){
        System.out.println("Flat number: " + flat + " Room amount: " + rooms.length);
    }
}
