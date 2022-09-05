package java_black_belt.section08_multithreading.lesson72_monitor_synchronized_blocks;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Ex12 {

    private static final Object LOCK = new Object();

    void mobileCall() {
        synchronized (LOCK) {
            log.info(LOCK);
            System.out.println("Mobile call starts...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (LOCK) {
            log.info(LOCK);
            System.out.println("Skype call starts...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsAppCall() {
        synchronized (LOCK) {
            log.info(LOCK);
            System.out.println("WhatsApp call starts...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();

    }

}

class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImplWhatsApp implements Runnable {
    @Override
    public void run() {
        new Ex12().whatsAppCall();
    }
}