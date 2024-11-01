package com.dmdev.homework;

import com.dmdev.homework.enums.Genre;

import java.util.*;

public class Cinema {
    private Map<Integer, Set<Movie>> cinema = new LinkedHashMap<>();

    public Cinema() {
    }

    public Cinema(Map<Integer, Set<Movie>> cinema) {
        this.cinema = cinema;
    }

    public void addMovie(int year, Movie movie) {
        Set<Movie> movieSet = cinema.getOrDefault(year, new LinkedHashSet<>());
        movieSet.add(movie);
        cinema.put(year, movieSet);
    }

    public Set<Movie> getMoviesByYear(int year) {
        return new LinkedHashSet<>(cinema.get(year));
    }

    public Set<Movie> getMoviesByYearAndMonth(int year, int month) {
        Set<Movie> result = new LinkedHashSet<>();
        Set<Movie> movieSet = cinema.get(year);
        for (Movie movie : movieSet) {
            if (movie.getMonth() == month) {
                result.add(movie);
            }
        }
        return result;
    }

    public void setCinema(Map<Integer, Set<Movie>> cinema) {
        this.cinema = cinema;
    }

    public Set<Movie> getMoviesByGenre(Genre genre) {
        Set<Movie> result = new LinkedHashSet<>();
        for (Map.Entry<Integer, Set<Movie>> cinemaEntry : cinema.entrySet()) {
            for (Movie movie : cinemaEntry.getValue()) {
                if (movie.getGenre() == genre) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cinema=" + cinema +
                '}';
    }

    public Map<Integer, Set<Movie>> getCinema() {
        return cinema;
    }
}
