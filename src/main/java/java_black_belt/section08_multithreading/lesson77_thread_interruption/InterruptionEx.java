package java_black_belt.section08_multithreading.lesson77_thread_interruption;

public class InterruptionEx {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main starts");

        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();

        Thread.sleep(2000);
        interruptedThread.interrupt();

        interruptedThread.join();
        System.out.println("Main ends");

    }

}

class InterruptedThread extends Thread {

    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1_000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Someone wants to interrupt this thread");
                System.out.println("Ending thread...");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted while sleeping. Ending thread...");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }

}
