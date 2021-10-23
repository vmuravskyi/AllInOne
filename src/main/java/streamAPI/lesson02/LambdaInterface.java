package streamAPI.lesson02;

import java.util.function.Consumer;

public class LambdaInterface {
    public static void main(String[] args) {
        Consumer<String> consumer1 = msg -> System.out.println(msg.length());

    }
}
