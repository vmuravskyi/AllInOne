package functional_reactive_programming_java.section13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

public class CustomCollector {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 3, 5, 6, 8, 34, 65, 345, 234, 2, 22, 77, 45, 4, 88, 453);

        Collector<Integer, List<Integer>, List<Integer>> toList = Collector.of(
            ArrayList::new,
            List::add,
            (list1, list2) -> {
                list1.addAll(list2);
                return list1;
            },
            Characteristics.IDENTITY_FINISH);

        List<Integer> evens = numbers.stream()
            .filter(integer -> (integer % 2) == 0)
            .collect(toList);
        evens.forEach(System.out::println);

        System.out.println("***********************************");

        Collector<Integer, List<Integer>, List<Integer>> toSortedListCollector = Collector.of(
            ArrayList::new,
            List::add,
            (list1, list2) -> {
                list1.addAll(list2);
                return list1;
            },
            list -> {
                Collections.sort(list);
                return list;
            },
            Characteristics.UNORDERED);

        List<Integer> sortedEvens = numbers.stream()
            .filter(integer -> integer % 2 == 0)
            .collect(toSortedListCollector);

        sortedEvens.forEach(System.out::println);
    }

}