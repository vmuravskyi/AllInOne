package java_black_belt.section08_multithreading.lesson75_lock_reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        new Employee("Oliver", lock);
        new Employee("John", lock);
        new Employee("Jack", lock);
        new Employee("Adam", lock);
        new Employee("Jeffry", lock);

    }

}

class Employee extends Thread {

    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " waiting...");
            lock.lock();
            System.out.println(name + " is using ATM");
            Thread.sleep(2000);
            System.out.println(name + " finished operation");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
