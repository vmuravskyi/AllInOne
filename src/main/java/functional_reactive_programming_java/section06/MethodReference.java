package functional_reactive_programming_java.section06;

import java.util.function.BiFunction;

public class MethodReference {

    public static void main(String[] args) {

        BiFunction<String, String, String> biFunction = A_Class::staticMethod;

        System.out.println(biFunction.apply("Basics", "Strong"));

    }

}

class A_Class {

    static String staticMethod(String a, String b) {
        return a + b;
    }
}
