package functional_reactive_programming_java.section14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ListFunctionalOperations {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Spotlight", 2015, "Hollywood"),
            new Movie("Avengers: Infinity War", 2018, "Hollywood"),
            new Movie("Inception", 2010, "Hollywood"),
            new Movie("Forest Gump", 1994, "Hollywood"),
            new Movie("3 Idiots", 2009, "Bollywood"),
            new Movie("Beauty and the beast", 2017, "Hollywood"),
            new Movie("Slumdog Millionaire", 2008, "Bollywood")
        );

        // Traversal
        movies.forEach(System.out::println);

        System.out.println("********************** Sorting ************************");

        movies.sort((o1, o2) -> o1.getReleaseYear() - o2.getReleaseYear());
        movies.forEach(System.out::println);

        System.out.println("**********************************************");

        System.out.println("********************** Mapping ************************");
        movies.stream()
            .map(movie -> movie.getName())
            .forEach(System.out::println);

        System.out.println("********************** Reduce ************************");
        Optional<String> reduced = movies.stream()
            .map(movie -> movie.getName())
            .reduce((movie, movie2) -> movie + " | " + movie2);
        System.out.println(reduced.get());

    }

}
