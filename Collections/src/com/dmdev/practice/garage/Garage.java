package com.dmdev.practice.garage;

import com.dmdev.practice.garage.cars.Car;
import com.dmdev.practice.garage.eums.Brand;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private final Map<Car, Integer> garage = new HashMap<>();

    public void park(Car car){
        int prevCount = garage.getOrDefault(car, 0);
        garage.put(car, ++prevCount);
    }

    public void departure(Car car){
        int currCount = garage.getOrDefault(car, 0);
        garage.put(car, --currCount);
    }

    public int getCarAmountByBrand(Brand brand){
        int result = 0;
        for (Car car : garage.keySet()) {
            if (car.getBrand() == brand){
                result += 1;
            }
        }
        return result;
    }

    public Map<Car, Integer> getGarage() {
        return garage;
    }

}
