package functional_reactive_programming_java.section10.reduce;

import functional_reactive_programming_java.section10.filter.Printer;
import java.util.stream.Stream;

public class ReduceOperation {

    public static void main(String[] args) {

        int result = Stream.of(1, 2, 34, 45, 56, 76, 78, 99)
            .reduce(0, (integer, integer2) -> integer += integer2);

        Printer.print(result);
    }

}
