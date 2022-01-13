package functional_reactive_programming_java.section10.numeric_streams;

import functional_reactive_programming_java.section10.filter.Printer;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Calculations {

    public static void main(String[] args) {

        // IntStream
        // DoubleStream
        // LongStream

        // Sum
        int sum = IntStream.of(1, 2, 3).sum();
        Printer.print(sum);

        // max () : Optional primitive
        OptionalInt max = IntStream.of(1, 2, 3).max();
        Printer.print(max.getAsInt());


        // min() : Optional primitive
        OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
        Printer.print(min.getAsInt());


        // average() : OptionalDouble primitive
        OptionalDouble average = IntStream.of(1, 3, 5, 7, 9).average();
        Printer.print(average.getAsDouble());


        // summaryStatistics()
        IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 24, 55, 159).summaryStatistics();
        Printer.print(intSummaryStatistics);
    }

}