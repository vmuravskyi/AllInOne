package java_black_belt.section08_multithreading.lesson76_daemon_threads;

import design_patterns.design_patterns__and_solid_principles.solid.singleresp.User;

public class DaemonExample {

    public static void main(String[] args) {

        System.out.println("Main thread starts");

        var userThread = new UserThread();
        userThread.setName("user thread");

        var daemonThread = new DaemonThread();
        daemonThread.setName("daemon thread");
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        System.out.println("Main thread ends");

    }

}

class UserThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
