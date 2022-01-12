package functional_reactive_programming_java.section10.numeric_streams;

import functional_reactive_programming_java.section10.Book;
import functional_reactive_programming_java.section10.filter.Printer;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreams {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        OptionalDouble average = books.stream()
            .map(Book::getRating)
            .mapToDouble(rating -> rating)
            .average();

        Printer.print(average.getAsDouble());

        // Streams with primitives

        IntStream intStream = IntStream.of(1, 3, 5, 7, 9);
        DoubleStream doubleStream = DoubleStream.of(1, 3, 5, 7, 9);
        LongStream longStream = LongStream.of(1L, 3L, 5L, 7L, 8L);

        // Streams of wrappers (ex. Integers) out of primitives

        Stream<Integer> integerStream = intStream.boxed();
        // or
        DoubleStream doubleStream1 = doubleStream
            .mapToObj(value -> value)
            .mapToDouble(value -> value);


    }


}
