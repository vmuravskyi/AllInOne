package java_black_belt.section08_multithreading.lesson86_synchronized_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionEx2 {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        List<Integer> syncList = Collections.synchronizedList(arrayList); // wrapped into synchronized list

        Runnable runnable = () -> {
            synchronized (syncList) {
                Iterator<Integer> iterator = syncList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = () -> syncList.remove(10);

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(syncList);
    }


}
