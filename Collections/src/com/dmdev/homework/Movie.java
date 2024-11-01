package com.dmdev.homework;

import com.dmdev.homework.enums.Genre;

public class Movie {
    private int id;
    private int year;
    private int month;
    private String name;
    private Genre genre;
    private double rating;

    public Movie(int id, int year, int month, String name, Genre genre, double rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }


}
