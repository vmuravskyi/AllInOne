package functional_reactive_programming_java.section05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PracticePredicate {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("BasicsStrong");

        Predicate<String> predicate = s -> !s.isEmpty();

        List<String> newList = filterList(list, predicate);
        System.out.println(newList);

        Predicate<String> filter = s -> s.contains("Basics");
        List<String> filteredList = filterList(list, filter);
        System.out.println(filteredList);


        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Predicate<Integer> integerPredicate = i -> i % 2 == 0;
        List<Integer> integers = filterList(intList, integerPredicate);
        System.out.println(integers);

    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        return list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
