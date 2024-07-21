package ar.com.alejandro.entities;

import java.util.List;

public class Catalog {

    private final List<Movie> movies;

    public Catalog(List<Movie> movies) {
        this.movies = movies;
    }

    public void getAll() {
        this.movies.forEach(System.out::println);
    }

    public void filterByGender() {
    }

    public void filterByYear() {
    }

    public void searchByTitle() {
    }

    public void maxScore() {
    }

    public void averageScore() {
    }

    public void sortedByYear() {

    }

    public void addMovie() {

    }

}
