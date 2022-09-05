package java_black_belt.section08_multithreading.lesson71_data_race_synchronized_methods;

public class Ex11 {

    volatile static int counter = 0;

    public synchronized static void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);

    }

}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex11.increment();
        }
    }

}