package java_collections_from_basics_to_advanced.lesson01_arrays;

import java.math.BigDecimal;

public class ElementsAssignmentsDemo {

    public static void main(String[] args) {

        int[] x = new int[3];
        x[0] = 'a';
        System.out.println(x[0]);
        byte b = 2;
        x[1] = b;
        System.out.println(x[1]);

        // --------------------------------------------------

        Object[] objArr = new Object[5];
        objArr[0] = new Object();
        objArr[1] = new String();

        // ---------------------------------------------------

        Number[] numbers = new Number[4];
        numbers[0] = 5;
        numbers[1] = 10.5f;
        numbers[2] = Byte.valueOf("2");
        numbers[3] = new BigDecimal("123.123");

        // ----------------------------------------------------

        Runnable[] runnables = new Runnable[5];
        runnables[0] = () -> System.out.println("I'm runnable number 1");

        runnables[0].run();

    }

}
