package functional_reactive_programming_java.section10.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOperation {

    public static void main(String[] args) {

        List<Integer> collect = Stream.of(24, 543, 34, 11, 56, 7766)
            .filter(integer -> integer > 100)
            .collect(Collectors.toList());

        String[] mas = {"asd", "12"};

        print(collect);
        print(Arrays.toString(mas));

    }

    public static <T> void print(T t) {
        System.out.println(t);
    }

}
