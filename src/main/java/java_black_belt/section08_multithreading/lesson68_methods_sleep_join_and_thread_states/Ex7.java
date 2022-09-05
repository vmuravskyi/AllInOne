package java_black_belt.section08_multithreading.lesson68_methods_sleep_join_and_thread_states;

public class Ex7 {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

    }

}
