package functional_reactive_programming_java.section10.infinite_streams;

import java.util.Random;
import java.util.stream.Stream;

public class InfiniteStreams {

    public static void main(String[] args) {

        Stream.iterate(1, integer -> integer * 2)
            .limit(15)
            .forEach(System.out::println);

        Stream.generate(() -> new Random().nextInt())
            .limit(100)
            .forEach(System.out::println);

    }

}
