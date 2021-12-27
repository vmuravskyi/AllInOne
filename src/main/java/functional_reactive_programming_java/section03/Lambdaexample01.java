package functional_reactive_programming_java.section03;

public class Lambdaexample01 {

    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(() -> System.out.println("Hello"));
        t.start();

    }

}
