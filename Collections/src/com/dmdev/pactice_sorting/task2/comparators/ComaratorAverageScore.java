package com.dmdev.pactice_sorting.task2.comparators;

import com.dmdev.pactice_sorting.task2.Student;

import java.util.Comparator;

public class ComaratorAverageScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getAverageScore(), o1.getAverageScore());
    }
}
