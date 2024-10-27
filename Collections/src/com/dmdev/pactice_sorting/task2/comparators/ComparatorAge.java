package com.dmdev.pactice_sorting.task2.comparators;

import com.dmdev.pactice_sorting.task2.Student;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
