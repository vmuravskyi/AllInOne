package java_black_belt.section08_multithreading.lesson82_semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {

    public static void main(String[] args) {

        Semaphore callBox = new Semaphore(2);

        new Person("John", callBox);
        new Person("Jack", callBox);
        new Person("Oliver", callBox);
        new Person("Andrzej", callBox);
        new Person("Piotr", callBox);

    }

}

class Person extends Thread {

    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println("A person is waiting of a Call Box");
            callBox.acquire();
            System.out.println(name + " is using Call Box");
            sleep(5000);
            System.out.println(name + " has finished a call");
            callBox.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
