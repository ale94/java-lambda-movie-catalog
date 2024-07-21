# Catálogo de Películas

Este es un proyecto de consola en Java que gestiona un catálogo de películas utilizando programación funcional con expresiones lambda y la API de Streams en Java.

## Funcionalidades

El programa permite realizar las siguientes operaciones:

1. Listar todas las películas.
2. Filtrar películas por género.
3. Filtrar películas por año de lanzamiento.
4. Buscar una película por título.
5. Obtener la película con la calificación más alta.
6. Obtener la calificación promedio de todas las películas.
7. Listar las películas ordenadas por año de lanzamiento.
8. Agregar una nueva película.
9. Eliminar una película.
10. Salir.

## Estructura del Proyecto

El proyecto está dividido en las siguientes clases:

- **Movie**: Representa una película con sus atributos (id, title, year, director, gender y score).
- **Catalog**: Gestiona la lista de películas y contiene la lógica de negocio y las operaciones.
- **Main**: Contiene el método principal para interactuar con el usuario a través de la consola.

## Uso

### Requisitos

- Java 8 o superior.

### Compilar y Ejecutar

1. Clona el repositorio o descarga los archivos del proyecto.
2. Abre una terminal y navega hasta el directorio del proyecto.
3. Compila el proyecto con el siguiente comando:

    ```sh
    javac Main.java Movie.java Catalog.java
    ```

4. Ejecuta el programa con el siguiente comando:

    ```sh
    java Main
    ```

### Ejemplo de Ejecución

Al ejecutar el programa, verás un menú como el siguiente:

```plaintext
Catalogo de Películas:
1. Listar todas las películas.
2. Filtrar películas por género.
3. Filtrar películas por año de lanzamiento.
4. Buscar una película por título.
5. Obtener la película con la calificación más alta.
6. Obtener la calificación promedio de todas las películas.
7. Listar las películas ordenadas por año de lanzamiento.
8. Agregar una nueva película.
9. Eliminar una película.
10. Salir.
Seleccione una opción:
