package com.dmdev.stream.homework;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.flatMapping;
import static java.util.stream.Collectors.toMap;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * 1. Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * 2. Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * 3. Объект с двумя полями:
 * <p>
 * - Отсортированный список студентов с пункта 2
 * <p>
 * - Средняя оценка этих студентов
 *
 * <p>
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */

public class Homework {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", "Pupkin", 1, List.of(4, 3, 4));
        Student student2 = new Student("Igor", "Igorev", 2, List.of(5, 5, 5));
        Student student3 = new Student("Sveta", "Svetikova", 2, List.of(4, 5, 5, 4));
        Student student4 = new Student("Jack", "Jonhson", 1, List.of(3, 5, 3, 4));
        Student student5 = new Student("Ibragim", "Ibragimov", 1, List.of(4, 3, 5));

        List<Student> studentList = List.of(
                student1,
                student2,
                student3,
                student4,
                student5
        );

        Map<Integer, Double> courseAveragesScores = studentList.stream()
                .filter(student -> student.getScoreList().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourseNumber,
                        Collectors.averagingDouble(student -> student.getScoreList().stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0)
                        )));

        System.out.println(courseAveragesScores);

//                .average()
//                .ifPresent(System.out::println);
//                .collect(toMap(Student::getCourseNumber, ))


    }
}
