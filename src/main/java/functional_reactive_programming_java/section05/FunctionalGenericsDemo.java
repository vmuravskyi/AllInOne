package functional_reactive_programming_java.section05;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalGenericsDemo {

    public static void main(String[] args) {

        FunctionalGenerics<String, String> func = s -> s.substring(1, 5);
        System.out.println(func.execute("JavaIsProgrammingLanguage"));

        Function<String, String> func2 = s -> s.substring(1, 5);
        System.out.println(func2.apply("Javaava"));

        FunctionalGenerics<String, Integer> func3 = String::length;
        System.out.println(func3.execute("Java"));

    }
}
