package functional_reactive_programming_java.section08.chaining;

public class Chaining {

    public static void main(String[] args) {

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = System.out::println;

        c1.accept("Hello");
        c2.accept("Hello");

        System.out.println("****************************");

        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        };

        c3.accept("Hello");

        System.out.println("*****************************");

        Consumer<String> c4 = c1.thenAccept(c2);

        c4.accept("BasicStrong");

    }

}
