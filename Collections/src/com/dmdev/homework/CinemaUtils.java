package com.dmdev.homework;

import java.util.List;
import java.util.Set;

public final class CinemaUtils {
    private CinemaUtils() {
    }

    public static Cinema createCinema(Set<Movie> movieList) {
        Cinema result = new Cinema();
        for (Movie movie : movieList) {
            result.addMovie(movie.getYear(), movie);
        }
        return result;
    }
}
