package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x + 10)
                .forEach(System.out::print);


        Stream.of(1, 2, 3, 4, 5, 6)
                .flatMap(x -> {
                    switch (x % 2) {
                        case 0:
                            return Stream.of(x, x * x);
                        case 1:
                            return Stream.of(x);
                        default:
                            return Stream.empty();
                    }
                })
                .forEach(System.out::println);


        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 5;

        mas = Arrays.stream(mas)
                .limit(n)
                .toArray();
        System.out.println(Arrays.toString(mas));

    }
}
