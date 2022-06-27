package java_collections_from_basics_to_advanced.lesson02_list_vector_stack_cursors.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorsListIteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();

        data.add("John");
        data.add("Sam");
        data.add("Benjamin");

        System.out.println(data);

        ListIterator<String> listIterator = data.listIterator();

        while (listIterator.hasNext()) {
            var next = listIterator.next();

            if (next.equals("Sam")) {
                listIterator.set("Jack");
            } else if (next.equals("Benjamin")) {
                listIterator.remove();
            }
        }

        System.out.println(data);
    }

}