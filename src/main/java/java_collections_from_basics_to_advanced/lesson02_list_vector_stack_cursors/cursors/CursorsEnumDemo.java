package java_collections_from_basics_to_advanced.lesson02_list_vector_stack_cursors.cursors;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorsEnumDemo {

    public static void main(String[] args) {

        Vector vector = new Vector();

        System.out.println("Enter the elements: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 8; i++) {
            var data = sc.nextInt();
            vector.add(data);
        }
        System.out.println("Vector: " + vector);

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            Integer element = (Integer) enumeration.nextElement();

            if (element % 3 == 0) {
                if (element != 0) {
                    System.out.println(element);
                }
            }
        }

    }

}