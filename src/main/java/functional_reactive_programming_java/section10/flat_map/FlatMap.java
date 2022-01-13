package functional_reactive_programming_java.section10.flat_map;

import functional_reactive_programming_java.section10.filter.Printer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("Hello, ", "there");
        Stream<String> stream2 = Stream.of("Learning ", "Java?");

        Stream<Stream<String>> stream1and2 = Stream.of(stream1, stream2);

        stream1and2.flatMap(stringStream -> stringStream)
            .forEach(Printer::print);

        Path path = Path.of(
            "src/main/java/functional_reactive_programming_java/section10/flat_map/The Notebook by Nicholas Sparks.txt");
        try (Stream<String> lines = Files.lines(path)) {
            List<String> collectedLine = lines
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());
            collectedLine.forEach(Printer::print);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
