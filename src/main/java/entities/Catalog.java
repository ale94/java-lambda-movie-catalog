package entities;

import java.util.List;

public class Catalog {

    private final List<Movie> movies;

    public Catalog(List<Movie> movies) {
        this.movies = movies;
    }

    public void getAll() {
        this.movies.forEach(System.out::println);
    }
}
