package functional_reactive_programming_java.section10.bounded_streams;

import functional_reactive_programming_java.section10.filter.Printer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class BoundedStreams {

    public static void main(String[] args) {

        // 1. stream() on a Collection
        List<Integer> list = List.of(1, 3, 5, 7, 9);
        Stream<Integer> integerStream = list.stream();

        // How to stream a map
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three", 4, "four", 5, "five");

        List<Entry<Integer, String>> collect = map.entrySet().stream()
            .filter(integerStringEntry -> integerStringEntry.getKey() > 2)
            .sorted((o1, o2) -> o2.getKey().compareTo(o1.getKey()))
            .collect(Collectors.toList());

        Printer.print(collect);

        Stream<String> valueStream = map.values().stream(); // values stream

        Stream<Integer> keyStream = map.keySet().stream(); // keys stream

        // 2. of() Stream class

        Stream<String> stringStream = Stream.of("Hey!", "Happy", "Thanksgiving");

        // 3. stream() on Arrays class
        Integer[] integersArr = {3, 5, 7, 89, 9};
        Stream<Integer> arrayStream = Arrays.stream(integersArr);

        int[] intArr = {3, 5, 7, 89, 9};
        IntStream primitiveIntStream = Arrays.stream(intArr);

        // 4. builder() of Stream class
        Builder<Integer> builder = Stream.builder();
        builder.add(1);

        // code

        // condition

        builder.add(4);

        Stream<Integer> build = builder.build();


    }

}
