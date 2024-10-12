package com.dmdev.homework1;

/**
 Представить в виде классов и их композиции следующую модель.
 - Каждый дом содержит свой номер (int), и множество этажей (массив).
 - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 - Каждая комната содержит поле проходная она или нет (boolean).
 В каждом классе реализовать метод print, который на консоль выводит информацию об объекте
 (должны присутствовать все поля объекта!).
 Например, метод print класса этаж должен выводить на консоль:
 “Этаж 2, количество квартир 18”
 Создание всех объектов вынести в отдельный класс с методом main.
 Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
 и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */


public class Main {
    public static void main(String[] args) {
        // Rooms filling
        Room[] rooms = new Room[3];
        for (int i = 0; i < rooms.length; i++){
            if (i % 2 == 0) {
                rooms[i] = new Room(true);
            } else{
                rooms[i] = new Room(false);
            }
        }
        // Flats filling
        Flat[] flats = new Flat[5];
        for (int i = 0; i < flats.length; i++){
            flats[i] = new Flat(i + 1, rooms);
        }
        // Floor filling
        Floor[] floors = new Floor[3];
        for (int i = 0; i < floors.length; i++){
            floors[i] = new Floor(i + 1,flats);
        }
        House[] houses = new House[5];
        for (int i = 0; i < houses.length; i++){
            houses[i] = new House(i + 1,floors);
        }

//        floors[1].print();
        printAllInformation(houses[0]);

    }

    public static void printAllInformation(House house) {
        // House
        house.print();
        // Floors
        Floor[] floors = house.getFloors();
        for(int i = 0; i < floors.length; i++){
            floors[i].print();
        }
        // Flats
        for(int i = 0; i < floors.length; i++){
            Flat[] flats = floors[i].getFlats();
            for(int j = 0; j < flats.length; j++){
                flats[j].print();

            }
        }
    }
}
