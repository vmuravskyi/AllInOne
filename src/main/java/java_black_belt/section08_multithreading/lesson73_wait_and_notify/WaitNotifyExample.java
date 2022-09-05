package java_black_belt.section08_multithreading.lesson73_wait_and_notify;

public class WaitNotifyExample {

    public static void main(String[] args) {

        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();

    }

}

class Market {

    private int breadCount = 0;
    private final Object LOCK = new Object();

    public void getBread() {
        synchronized (LOCK) {
            while (breadCount < 1) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Consumer consumed one bread");
            System.out.println("Bread left: " + breadCount);
            LOCK.notify();
        }
    }

    public void putBread() {
        synchronized (LOCK) {
            while (breadCount >= 5) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount++;
            System.out.println("Producer added one bread");
            System.out.println("Bread left: " + breadCount);
            LOCK.notify();
        }
    }

}

class Producer implements Runnable {

    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            market.putBread();
        }
    }

}

class Consumer implements Runnable {

    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            market.getBread();
        }
    }

}
