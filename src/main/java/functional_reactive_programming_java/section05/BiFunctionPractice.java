package functional_reactive_programming_java.section05;

import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {

//        BiFunction<T, U, R>
        BiFunction<String, String, Integer> biFunction = (s, s2) -> s.concat(s2).length();
        System.out.println(biFunction.apply("Basics", "Strong"));
    }
}
