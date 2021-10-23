package streamAPI.lesson02;

import java.util.function.Consumer;

public class LambdaImplementation {

    public static void main(String[] args) {

        System.out.println("Anonymous class:");
        for (int i = 0; i < 5; i++) {
            Consumer<String> printer1 = new Consumer<String>() {
                @Override
                public void accept(String msg) {
                    System.out.println("Consuming: " + msg);
                }
            };
            printer1.accept(printer1.toString());
        }


        System.out.println("---------------------------------");
        System.out.println("Lambda:");
        for (int i = 0; i < 5; i++) {
            Consumer<String> printer2 =
                    msg -> System.out.println("Consuming: " + msg);
            printer2.accept(printer2.toString());
        }

        System.out.println("---------------------------------");
        System.out.println("Constant-capturing lambda:");
        final int j = 42;
        for (int i = 0; i < 5; i++) {
            Consumer<String> printer3 =
                    msg -> System.out.println("Consuming: " + msg + ", " + j);
            printer3.accept(printer3.toString());
        }

        new LambdaImplementation().foo();
    }

    private int j2 = 5;
    public void foo() {
        System.out.println("---------------------------------");
        System.out.println("Instance-capturing lambda:");
        for (int i = 0; i < 5; i++) {
            Consumer<String> printer4 =
                    msg -> System.out.println("Consuming: " + msg + ", " + j2);
            printer4.accept(printer4.toString());
        }
    }
}
