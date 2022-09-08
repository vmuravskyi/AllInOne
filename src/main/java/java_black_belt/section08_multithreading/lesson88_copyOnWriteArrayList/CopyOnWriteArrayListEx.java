package java_black_belt.section08_multithreading.lesson88_copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {

    public static void main(String[] args) throws InterruptedException {

//        ArrayList<String> list = new ArrayList<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Jack");
        list.add("John");
        list.add("Oliver");
        list.add("Andrzej");
        list.add("Piotr");
        System.out.println(list);

        Runnable runnable1 = () -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Trying to add another element");
            list.remove(4);
            list.add("Another element");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(list);

    }

}
