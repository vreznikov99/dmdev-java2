package com.dmdev.pactice_lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Написать метод, который принимает целочисленный список и возвращает
 * целочисленный список только с нечетными значениями.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,6,7,9,10,11);
        List<Integer> result = removeEven(list);
        System.out.println(result);

    }

    private static List<Integer> removeEven(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 != 0){
                result.add(num);
            }
        }
        return result;
    }
}
