package java_black_belt.section08_multithreading.lesson66_thread_creation;

import java.util.stream.IntStream;

public class Ex4 {

    public static void main(String[] args) {

        new Thread(() ->
            IntStream.range(0, 1000)
                .forEach(operand -> {
                    if (operand % 2 != 0) {
                        System.out.println(operand);
                    }
                })
        ).start();

    }

}
