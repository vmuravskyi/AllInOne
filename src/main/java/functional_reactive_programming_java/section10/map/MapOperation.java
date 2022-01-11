package functional_reactive_programming_java.section10.map;

import functional_reactive_programming_java.section10.filter.Printer;
import java.util.stream.Stream;

public class MapOperation {

    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .map(integer -> integer * 2)
            .forEach(Printer::print);

    }

}
