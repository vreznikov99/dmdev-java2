package com.dmdev.homework;

import com.dmdev.homework.enums.Genre;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CinemaRunner {
    public static void main(String[] args) {
        Movie movie1 = new Movie(1, 2015, 4, "The Martian", Genre.DOCUMENTARY, 4.4);
        Movie movie2 = new Movie(2, 2020, 6, "Soul", Genre.DRAMA, 4.5);
        Movie movie3 = new Movie(3, 2012, 7, "The Avengers", Genre.ACTION, 4.5);
        Movie movie4 = new Movie(4, 2020, 12, "Tenet", Genre.THRILLER, 4.2);
        Movie movie5 = new Movie(5, 2018, 8, "Bohemian Rhapsody", Genre.DRAMA, 4.4);
        Movie movie6 = new Movie(6, 2015, 5, "Mad Max: Fury Road", Genre.ACTION, 4.7);
        Movie movie7 = new Movie(7, 2020, 3, "Wonder Woman 1984", Genre.ACTION, 4.0);
        Movie movie8 = new Movie(8, 2012, 11, "Avatar", Genre.ACTION, 4.8);
        Movie movie9 = new Movie(9, 2015, 9, "Inside Out", Genre.COMEDY, 4.6);
        Movie movie10 = new Movie(10, 2018, 8, "Black Panther", Genre.ACTION, 4.3);

        Set<Movie> movieList = new LinkedHashSet<>(Arrays.asList(
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
                movie8,
                movie9,
                movie10
        ));

        Cinema cinema = CinemaUtils.createCinema(movieList);
        System.out.println(cinema.getCinema());
        System.out.println(cinema.getMoviesByYear(2015));
    }




}
