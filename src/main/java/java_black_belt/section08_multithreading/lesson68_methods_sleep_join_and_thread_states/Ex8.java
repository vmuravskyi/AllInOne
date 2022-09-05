package java_black_belt.section08_multithreading.lesson68_methods_sleep_join_and_thread_states;

public class Ex8 extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Ex8 thread2 = new Ex8();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("The End");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
}
