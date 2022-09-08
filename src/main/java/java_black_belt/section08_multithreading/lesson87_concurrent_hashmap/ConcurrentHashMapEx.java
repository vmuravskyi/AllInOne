package java_black_belt.section08_multithreading.lesson87_concurrent_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

    public static void main(String[] args) throws InterruptedException {

//        HashMap<Integer, String> hashMap = new HashMap<>();
        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1, "Jack");
        hashMap.put(2, "John");
        hashMap.put(3, "Oliver");
        hashMap.put(4, "Michael");
        hashMap.put(5, "Andrzej");
        System.out.println(hashMap);

        Runnable runnable = () -> {
            Iterator<Integer> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer key = iterator.next();
                System.out.println(key + " : " + hashMap.get(key));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hashMap.put(6, "Piotr");
            System.out.println("Added another element");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(hashMap);

    }

}
