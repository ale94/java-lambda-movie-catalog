package ar.com.alejandro;

import ar.com.alejandro.entities.Catalog;
import ar.com.alejandro.entities.Movie;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var movies = List.of(
            new Movie("Inception", 2010, "Christopher Nolan", "Sci-Fi", 9),
            new Movie("The Matrix", 1999, "Lana Wachowski", "Sci-Fi", 8),
            new Movie("Interstellar", 2014, "Christopher Nolan", "Sci-Fi", 8),
            new Movie("The Godfather", 1972, "Francis Ford Coppola", "Crime", 9),
            new Movie("The Batman", 2022, "Matt Reeves", "Sci-Fi", 8),
            new Movie("Joker", 2019, "Todd Phillips", "Crime", 10)
        );

        Catalog catalog = new Catalog(movies);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nCatalogo de Películas:");
            System.out.println("1. Listar todas las películas.");
            System.out.println("2. Filtrar películas por género.");
            System.out.println("3. Filtrar películas por año de lanzamiento.");
            System.out.println("4. Buscar una película por título.");
            System.out.println("5. Obtener la película con la calificación más alta.");
            System.out.println("6. Obtener la calificación promedio de todas las películas.");
            System.out.println("7. Listar las películas ordenadas por año de lanzamiento.");
            System.out.println("8. Agregar una nueva película.");
            System.out.println("9. Eliminar una película.");
            System.out.println("10. Salir.");
            System.out.print("Seleccione una opción: ");
            var op = scanner.nextInt();
            switch (op) {
                case 1 -> catalog.getAll();
                case 2 -> catalog.filterByGender();
                case 3 -> catalog.filterByYear();
                case 4 -> catalog.searchByTitle();
                case 5 -> catalog.maxScore();
                case 6 -> catalog.averageScore();
                case 7 -> catalog.sortedByYear();
                case 8 -> catalog.addMovie();
                case 9 -> catalog.deleteMovie();
                case 10 -> {
                    System.out.println("Saliendo del catalogo de películas hasta la próxima.");
                    return;
                }
                default -> System.out.println("Comando Incorrecto, Digite un numero del 1 al 9.");
            }
        }
    }

}
