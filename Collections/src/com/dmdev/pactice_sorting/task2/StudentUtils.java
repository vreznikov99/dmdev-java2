package com.dmdev.pactice_sorting.task2;

import java.util.List;
import java.util.ListIterator;

public final class StudentUtils {
    private StudentUtils() {
    }

    public static Student maxAverageScore(List<Student> list) {
        ListIterator<Student> listIterator = list.listIterator();
        Student studentWithMaxScore = null;
        while(listIterator.hasNext()){
            Student nextStudent = listIterator.next();
            if (studentWithMaxScore == null || studentWithMaxScore.getAverageScore() < nextStudent.getAverageScore()){
                studentWithMaxScore = nextStudent;
            }
        }
        return studentWithMaxScore;
    }
}
