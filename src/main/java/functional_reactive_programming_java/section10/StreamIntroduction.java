package functional_reactive_programming_java.section10;

import functional_reactive_programming_java.section10.filter.Printer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamIntroduction {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Java", "Blinov", "Programming", 10.0));

        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3) {
                filteredBooks.add(book);
            }
        }

        // java 8

        Predicate<Book> byProgrammingGenre = book ->
            book.getGenre().equalsIgnoreCase("Programming");

        Predicate<Book> highRating = book -> book.getRating() > 3;

        books.stream()
            .parallel()
            .filter(byProgrammingGenre)
            .filter(highRating)
            .map(Book::getName)
            .forEach(Printer::print);

    }
}
