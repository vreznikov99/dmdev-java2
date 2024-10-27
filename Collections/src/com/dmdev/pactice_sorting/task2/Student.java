package com.dmdev.pactice_sorting.task2;

public class Student implements Comparable<Student>{
    private String name;
    private String lastname;
    private int age;
    private double averageScore;

    public Student(String name, String lastname, int age, double averageScore) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getFullName(){
        return name + " " + lastname;
    }

    @Override
    public int compareTo(Student o) {
        return getFullName().compareTo(o.getFullName());
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}';
    }
}
