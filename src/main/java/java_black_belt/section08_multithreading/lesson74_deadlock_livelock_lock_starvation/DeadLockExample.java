package java_black_belt.section08_multithreading.lesson74_deadlock_livelock_lock_starvation;

public class DeadLockExample {

    public static final Object LOCK1 = new Object();
    public static final Object LOCK2 = new Object();

    public static void main(String[] args) {

        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();

    }

}

class Thread10 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread10: Trying to get monitor of object LOCK1");
        synchronized (DeadLockExample.LOCK1) {
            System.out.println("Thread10: Successfully captured monitor of object LOCK1");

            System.out.println("Thread10: Trying to get monitor of object LOCK2");
            synchronized (DeadLockExample.LOCK2) {
                System.out.println("Thread10: Monitors of objects LOCK1 and LOCK2 are captured");
            }
        }
    }
}

class Thread20 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread20: Trying to get monitor of object LOCK2");
        synchronized (DeadLockExample.LOCK2) {
            System.out.println("Thread20: Successfully captured monitor of object LOCK2");

            System.out.println("Thread20: Trying to get monitor of object LOCK1");
            synchronized (DeadLockExample.LOCK1) {
                System.out.println("Thread20: Monitors of objects LOCK1 and LOCK2 are captured");
            }
        }
    }
}