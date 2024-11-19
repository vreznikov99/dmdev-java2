package com.dmdev.stream.homework;

import java.util.List;

/**
 *  * Дан список студентов с полями:
 *  * - Имя
 *  * - Фамилия
 *  * - Номер курса в университете
 *  * - Список оценок за учебу
 */

public class Student {
    private String name;
    private String lastname;
    private int courseNumber;
    private List<Integer> scoreList;

    public Student(String name, String lastname, int courseNumber, List<Integer> scoreList) {
        this.name = name;
        this.lastname = lastname;
        this.courseNumber = courseNumber;
        this.scoreList = scoreList;
    }

    public Student(String name, String lastname, int courseNumber) {
        this.name = name;
        this.lastname = lastname;
        this.courseNumber = courseNumber;
    }

    public void setScoreList(List<Integer> scoreList) {
        this.scoreList = scoreList;
    }

    public String fullName(){
        return getName() + " " + getLastname();
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public List<Integer> getScoreList() {
        return scoreList;
    }
}

