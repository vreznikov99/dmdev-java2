package com.dmdev.pactice_sorting.task2;

import com.dmdev.pactice_sorting.task2.comparators.ComaratorAverageScore;
import com.dmdev.pactice_sorting.task2.comparators.ComparatorAge;

import java.util.*;

public class StudentsRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Jack", "Ivanoc", 15, 4.6);
        Student student2 = new Student("Alice", "Petrova", 16, 4.9);
        Student student3 = new Student("Bob", "Sidorov", 14, 3.8);
        Student student4 = new Student("Charlie", "Kuznetsov", 18, 4.2);
        Student student5 = new Student("Diana", "Smirnova", 20, 4.5);
        Student student6 = new Student("Eve", "Novikova", 19, 4.7);


        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5, student6));
        System.out.println(StudentUtils.maxAverageScore(students));

        Collections.sort(students); // DEFAULT - with compareTo (Comparable interface)
        System.out.println(students);

        students.sort(new ComparatorAge()); // with compare (Comparator interface)
        System.out.println(students);

        students.sort(new ComaratorAverageScore()); // with compare (Comparator interface)
        System.out.println(students);

    }
}
