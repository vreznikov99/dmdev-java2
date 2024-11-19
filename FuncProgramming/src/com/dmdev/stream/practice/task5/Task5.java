package com.dmdev.stream.practice.task5;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 5. Дан класс Person с полями firstName, lastName,
 * age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 */
public class Task5 {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Pupkin", 12);
        Person person2 = new Person("Max", "Petrov", 11);
        Person person3 = new Person("Petr", "Petrov", 14);
        Person person4 = new Person("Jack", "Johnson", 16);
        Person person5 = new Person("Will", "Wilson", 11);
        Person person6 = new Person("Ibragim", "Ibragimkin", 28);

        List<Person> personList = List.of(
                person1,
                person2,
                person3,
                person4,
                person5,
                person6
        );

        personList.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<Person>> map =
                personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(map);

        Map<Integer, List<String>> map2 = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getFullName, Collectors.toList())));

        System.out.println(map2);

    }
}
