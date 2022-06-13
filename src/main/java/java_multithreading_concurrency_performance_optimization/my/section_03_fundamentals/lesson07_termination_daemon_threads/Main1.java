package java_multithreading_concurrency_performance_optimization.my.section_03_fundamentals.lesson07_termination_daemon_threads;

public class Main1 {

    public static void main(String [] args) {
        Thread thread = new Thread(new BlockingTask());

        thread.start();


        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {

        @Override
        public void run() {
            //do things
            try {
                Thread.sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("Existing blocking thread");
            }
        }
    }

}