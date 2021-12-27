package functional_reactive_programming_java.section03;

import java.util.stream.IntStream;

public class ImperativeVsDecclarative {

    public static void main(String[] args) {


        // inmperative
        int sumOfEvents = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sumOfEvents += i;
            }
        }
        System.out.println(sumOfEvents);

        // declarative
        sumOfEvents = IntStream.range(0, 100)
                .filter(value -> value % 2 == 0)
                .reduce(Integer::sum)
                .getAsInt();
        System.out.println(sumOfEvents);
    }
}
