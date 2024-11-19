package com.dmdev.stream.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 3. Дана Map<String, Integer>. Найти сумму всех
 * значений, длина ключей которых меньше 7
 * символов.
 */

public class Task3 {
    public static void main(String[] args) {

        Map<String, Integer> map = Map.of(
                "str1", 1,
                "string-2", 2,
                "string-3", 3,
                "str4", 4,
                "str5", 5,
                "string-6", 6,
                "string-7", 7,
                "str8", 8,
                "string-9", 9
        );

        int sum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();

        System.out.println(sum);


    }
}
