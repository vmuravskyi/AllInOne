package java_black_belt.section08_multithreading.lesson67_thread_name_and_thread_priority;

public class Ex5 {

    public static void main(String[] args) {

        MyThread5 myThread5 = new MyThread5();
        MyThread5 myThread6 = new MyThread5();

        myThread5.setName("My thread");
        myThread5.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Name of myThread5 = " + myThread5.getName());
        System.out.println("Priority of myThread5 = " + myThread5.getPriority());

    }

}

class MyThread5 extends Thread {

    @Override
    public void run() {
        System.out.println("Hello");
    }

}
