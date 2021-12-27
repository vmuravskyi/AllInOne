package functional_reactive_programming_java.section05;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {

        List<Integer> list = List.of(34, 67, 8, 23, 67, 89, 90);
        Consumer<Integer> consumer = System.out::println;
        for (Integer integer : list) {
            consumer.accept(integer);
        }

    }
}
