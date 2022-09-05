package java_black_belt.section08_multithreading.lesson72_monitor_synchronized_blocks;

public class SynchronizedBlock1 {

    public static void main(String[] args) {

        MyRunnableImpl runnable = new MyRunnableImpl();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Counter {

    volatile static int count = 0;
}

class MyRunnableImpl implements Runnable {

    // example of using synchronized block in a method
    private void doSomething() {

        System.out.println("123");
        System.out.println("123");

        synchronized (this) {
            System.out.println("123");
            System.out.println("123");
            System.out.println("123");
        }

    }

    // example of using synchronized block in a static method
    private static void staticDoSomething() {

        System.out.println("123");
        System.out.println("123");

        synchronized (SynchronizedBlock1.class) {
            System.out.println("123");
            System.out.println("123");
            System.out.println("123");
        }

    }

    public void increment() {
        synchronized (this) {
            Counter.count++;
            System.out.print(Counter.count + " ");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }

}
