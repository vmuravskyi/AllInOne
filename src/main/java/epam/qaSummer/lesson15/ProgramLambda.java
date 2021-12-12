package epam.qaSummer.lesson15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.IntStream.iterate;


public class ProgramLambda {
    public static void main(String[] args) {
//        BiFunction<Double, Double, Double> sum = (x, y) -> x + y;
//        BiFunction<Double, Double, Double> multy = (x, y) -> x * y;
//        BiFunction<Double, Double, Double> div = (x, y) -> x / y;
//        BiFunction<Double, Double, Double> sub = (x, y) -> x - y;
//
//        Object[] opers = {
//                sum,
//                multy,
//                div
//        };
//
//        for (var op : opers) {
//            BiFunction<Double, Double, Double> o = (BiFunction<Double, Double, Double>) op;
//            System.out.println(o.apply(5.0, 4.0));
//        }
//
//
//        IntStream.of(120, 410, 85, 32, 314, 12)
//                .filter(x -> x < 300)
//                .map(x -> x + 11)
//                .limit(3)
//                .forEach(System.out::print);
//
//
//        int[] arr = {120, 410, 85, 32, 314, 12};
//        int count = 0;
//        for (int x : arr) {
//            if (x >= 300) continue;
//            x += 11;
//            count++;
//            if (count > 3) break;
//            System.out.print(x);
//        }


        ArrayList<Integer> list = new ArrayList<>();
        Stream.iterate(2, x -> x < 10000, x -> x + 3)
                .filter(x -> x % 2 == 0);
    }
}
