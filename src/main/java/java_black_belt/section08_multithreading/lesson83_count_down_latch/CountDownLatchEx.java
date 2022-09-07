package java_black_belt.section08_multithreading.lesson83_count_down_latch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {

    private static final CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {

        new Friend("Jack", countDownLatch);
        new Friend("John", countDownLatch);
        new Friend("Oliver", countDownLatch);
        new Friend("Andrzej", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();

    }

}

class Friend extends Thread {

    private String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " is shopping");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
