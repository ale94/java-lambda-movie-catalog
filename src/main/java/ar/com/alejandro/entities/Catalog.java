package ar.com.alejandro.entities;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Catalog {

    private final List<Movie> movies;
    Scanner scanner = new Scanner(System.in);

    public Catalog(List<Movie> movies) {
        this.movies = movies;
    }

    public void getAll() {
        this.movies.forEach(movie -> System.out.println(movie.getTitle()));
    }

    public void filterByGender() {
        System.out.print("Digite el genero: ");
        var gender = scanner.nextLine();
        this.movies.stream()
                .filter(movie -> movie.getGender().equals(gender))
                .forEach(movie -> System.out.println(movie.getTitle()));
    }

    public void filterByYear() {
        System.out.print("Digite el año de lanzamiento: ");
        var year = scanner.nextInt();
        this.movies.stream()
                .filter(movie -> movie.getYear().equals(year))
                .forEach(movie -> System.out.println(movie.getTitle()));
    }

    public void searchByTitle() {
        System.out.print("Digite el nombre de la película: ");
        var movie = scanner.nextLine();
        var movieFromData = this.movies.stream()
                .filter(m -> m.getTitle().equals(movie))
                .findFirst()
                .orElseThrow();
        System.out.println(movieFromData.getTitle());
    }

    public void maxScore() {
        long max = this.movies.stream()
                .mapToLong(Movie::getScore)
                .max()
                .orElseThrow();
        System.out.println("Mejor calificación: " + max);
    }

    public void averageScore() {
        double average = this.movies.stream()
                .mapToInt(Movie::getScore)
                .average()
                .orElseThrow();
        System.out.println("Promedio: " + average);
    }

    public void sortedByYear() {
        Comparator<Movie> movieComparator = Comparator.comparing(Movie::getYear);
        this.movies.stream()
                .sorted(movieComparator)
                .forEach(movie -> System.out.println(movie.getTitle()));
    }

    public void addMovie() {
        System.out.print("Titulo de la película: ");
        var title = scanner.nextLine();
        System.out.print("Año de lanzamiento: ");
        var year = Integer.parseInt(scanner.nextLine());
        System.out.print("Director: ");
        var director = scanner.nextLine();
        System.out.print("Genero: ");
        var gender = scanner.nextLine();
        System.out.print("Calificación: ");
        var score = Integer.parseInt(scanner.nextLine());
        var movieToSave = new Movie(title, year, director, gender, score);
        this.movies.add(movieToSave);
        System.out.println("Película agregada en el catalogo: " + movieToSave);
    }

    public void deleteMovie() {
        System.out.print("Titulo a eliminar: ");
        var movieToDelete = scanner.nextLine();
        System.out.println("Película eliminada del catalogo: " + movieToDelete);
        this.movies.removeIf(movie -> movie.getTitle().equals(movieToDelete));
    }

}
