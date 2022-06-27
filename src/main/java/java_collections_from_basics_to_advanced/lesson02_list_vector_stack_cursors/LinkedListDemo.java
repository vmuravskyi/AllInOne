package java_collections_from_basics_to_advanced.lesson02_list_vector_stack_cursors;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList lList = new LinkedList();
//        LinkedList<Integer> lList = new LinkedList<>(Collection c);

        lList.add("John");
        lList.add(10);
        lList.add(null);

        System.out.println(lList);

        lList.set(1, 123); // replaces the value under index 1
        System.out.println(lList);

        lList.add(1, 234);
        System.out.println(lList); // add a value under a specific index and shifts all the rest

        lList.removeLast();
        System.out.println(lList);

        lList.addFirst("First");
        System.out.println(lList);


    }

}
