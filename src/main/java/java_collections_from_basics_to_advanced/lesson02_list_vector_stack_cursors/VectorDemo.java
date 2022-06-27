package java_collections_from_basics_to_advanced.lesson02_list_vector_stack_cursors;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector vector = new Vector<>();

        Vector anotherVector = new Vector(60, 5);
        System.out.println(anotherVector.capacity());


        anotherVector.add(0, "Object");
        anotherVector.addElement("Another Object");

        System.out.println(anotherVector);

        anotherVector.remove("Object");
        System.out.println(anotherVector);

        anotherVector.remove(0);
        System.out.println(anotherVector);

    }

}