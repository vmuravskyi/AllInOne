package other;


import java.util.Random;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(3,5,3,2,9,1);
        stream.map(x -> x +2)
                .distinct()
                .forEach(System.out::print);
        }
    }