package com.dmdev.stream.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * 1. Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,10,15,20,25);
        OptionalDouble averageDouble = integerList.stream()
                .filter(num -> num % 2 != 0)
                .filter(num -> num % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();

        averageDouble.ifPresent(System.out::println);


    }
}
