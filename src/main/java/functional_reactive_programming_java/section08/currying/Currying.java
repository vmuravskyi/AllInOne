package functional_reactive_programming_java.section08.currying;

import functional_reactive_programming_java.section08.composition.Function;

import java.util.ArrayList;
import java.util.List;

public class Currying {

    public static void main(String[] args) {

        Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u + v;

        Function<Integer, Integer> fun2 = fun1.apply(1);


        Integer sum = fun2.apply(2);
        System.out.println(sum);

        Integer sum2 = fun2.apply(5);
        System.out.println(sum2);


        String alphabet = "abcdefghijklmopqrstuvwxyz";
        String name = "Volodymyr";

        long result = countNumberOfSymbolFirstHalfOfAlphabet(alphabet, name);
        System.out.println(result);
    }

    private static long countNumberOfSymbolFirstHalfOfAlphabet(String halfOfAlphabet, String name) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            list.add(name.charAt(i));
        }
        return halfOfAlphabet.chars()
                .filter(value -> (halfOfAlphabet.length() / 2) > halfOfAlphabet.indexOf(value))
                .filter(value -> list.contains((char) value))
                .count();
    }
}
