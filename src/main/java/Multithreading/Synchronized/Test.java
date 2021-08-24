package Multithreading.Synchronized;

public class Test {
    private int counter;

    public static void main(String[] args) {
        Test test = new Test();
        test.doWork();
    }

    public synchronized void increment() {
            counter++;
    }

    public void doWork() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // 'main' waits until this thread is done
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join(); // 'main' waits until this thread is done
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}
