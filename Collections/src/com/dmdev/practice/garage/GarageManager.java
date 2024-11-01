package com.dmdev.practice.garage;

import com.dmdev.practice.garage.cars.Bus;
import com.dmdev.practice.garage.cars.Car;
import com.dmdev.practice.garage.cars.RaceCar;
import com.dmdev.practice.garage.cars.Truck;
import com.dmdev.practice.garage.eums.Brand;
import com.dmdev.practice.garage.eums.Color;
import com.dmdev.practice.garage.eums.Model;

/**
 * 2. Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * Создать 4 класса, являющихся наследниками Car.
 *
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 * Создать класс Garage, хранящий в себе HashMap автомобилей, в котором ключом является объект автомобиля,
 * значением - количество точно таких автомобилей в гараже.
 *
 * Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного
 * вида автомобилей.
 *
 * Продемонстрировать работу гаража.
 */

public class GarageManager {
    public static void main(String[] args) {
        Car car1 = new RaceCar(Brand.BMW, Model.SEDAN, 2007, Color.BLACK, 230);
        Car car2 = new Truck(Brand.ACURA, Model.SEDAN, 2007, Color.BLACK, 30);
        Car car3 = new Bus(Brand.HONDA, Model.STATION_WAGON, 2007, Color.BLACK, 50);
        Car car4 = new RaceCar(Brand.MERCEDES, Model.HATCHBACK, 2007, Color.BLACK, 160);
        Car car5 = new Truck(Brand.BMW, Model.STATION_WAGON, 2007, Color.BLACK, 70);
        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car1);
        garage.park(car2);
        garage.park(car3);
        garage.park(car4);
        garage.park(car5);
        System.out.println(garage.toString());
        System.out.println(garage.getCarAmountByBrand(Brand.BMW));
        garage.departure(car1);
        System.out.println(garage.toString());
        System.out.println(garage.getCarAmountByBrand(Brand.BMW));

    }

}
