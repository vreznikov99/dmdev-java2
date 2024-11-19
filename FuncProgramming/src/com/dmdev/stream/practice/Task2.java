package com.dmdev.stream.practice;

import java.util.List;

/**
 * 2. Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> stringList = List.of(
                "string-1",
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-12",
                "string-16"
        );

        long count = stringList.stream()
                .distinct()
                .filter(str -> str.length() > 8)
//                .forEach(System.out::println);
                .count();

        System.out.println(count);

    }
}
