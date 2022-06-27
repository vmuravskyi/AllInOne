package java_collections_from_basics_to_advanced.lesson02_list_vector_stack_cursors.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(12);
        arraylist.add(23);
        arraylist.add(44);
        arraylist.add(36);

        System.out.println(arraylist);

        Iterator<Integer> iterator = arraylist.iterator();

        while (iterator.hasNext()) {
            var next = iterator.next();

            if (next % 3 == 0) {
                System.out.println(next);
            } else {
                iterator.remove();
            }
        }

        System.out.println(arraylist);
    }

}