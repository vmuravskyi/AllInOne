package functional_reactive_programming_java.section11.spliterator;

import functional_reactive_programming_java.section10.filter.Printer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadingObjectsFromFile {

    public static void main(String[] args) {

        Path path = Path.of("src/main/java/functional_reactive_programming_java/section11/spliterator/Books.txt");

        try {
            Stream<String> lines = Files.lines(path);
            Spliterator<String> baseSpliterator = lines.spliterator();
            Spliterator<Book> bookSpliterator = new BookSpliterator(baseSpliterator);
            Stream<Book> bookStream = StreamSupport.stream(bookSpliterator, false);
            List<Book> bookList = bookStream.collect(Collectors.toList());
            for (Book book : bookList) {
                Printer.print(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
