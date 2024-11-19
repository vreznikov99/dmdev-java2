package com.dmdev.stream.practice;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 4. Дан список целых чисел, вывести строку,
 * представляющую собой конкатенацию
 * строковых представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}
 * Результирующая строка: "52421"
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(5, 2, 4, 2, 1);
        String string = integerList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(string);

//        Optional<String> s = integerList.stream()
//                .map(String::valueOf)
//                .reduce((v1, v2) -> v1 + v2);
//        s.ifPresent(System.out::println);
    }
}
