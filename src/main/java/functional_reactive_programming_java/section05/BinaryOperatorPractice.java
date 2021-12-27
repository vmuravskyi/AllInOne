package functional_reactive_programming_java.section05;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {

    public static void main(String[] args) {

        BinaryOperator<String> binaryOperator = (s, s2) -> s + "." + s2;
        System.out.println(binaryOperator.apply("BasicsStrong", "com"));
    }
}
