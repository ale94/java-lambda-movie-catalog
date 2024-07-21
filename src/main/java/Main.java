import entities.Catalog;
import entities.Movie;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
            new Movie("Inception", 2010, "Christopher Nolan", "Sci-Fi", 9),
            new Movie("The Matrix", 1999, "Lana Wachowski", "Sci-Fi", 8),
            new Movie("Interstellar", 2014, "Christopher Nolan", "Sci-Fi", 8),
            new Movie("The Godfather", 1972, "Francis Ford Coppola", "Crime", 9),
            new Movie("The Batman", 2022, "Matt Reeves", "Sci-Fi", 8),
            new Movie("Joker", 2019, "Todd Phillips", "Crime", 10)
        );

        Catalog catalog = new Catalog(movies);
        catalog.getAll();

//        System.out.println("Catalogo de Películas:");
//        System.out.println("1. Listar todas las películas");
//        System.out.println("2. Filtrar películas por género");
//        System.out.println("3. Filtrar películas por año de lanzamiento");
//        System.out.println("4. Buscar una película por título");
//        System.out.println("5. Obtener la película con la calificación más alta");
//        System.out.println("6. Obtener la calificación promedio de todas las películas");
//        System.out.println("7. Listar las películas ordenadas por año de lanzamiento");
//        System.out.println("8. Agregar una nueva película");
//        System.out.println("9. Salir");
//        System.out.print("Seleccione una opción: ");



    }
}
