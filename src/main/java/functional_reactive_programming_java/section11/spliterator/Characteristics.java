package functional_reactive_programming_java.section11.spliterator;

import functional_reactive_programming_java.section10.filter.Printer;

import java.util.ArrayList;
import java.util.Spliterator;

public class Characteristics {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(2);
        list.add(1);

        Spliterator<Integer> spliterator = list.stream().spliterator();
        int bits = spliterator.characteristics();
        Printer.print(Integer.bitCount(bits));

        // OR

        System.out.println(Integer.bitCount(bits | 0x00000010));

        // AND

        System.out.println(Integer.bitCount(bits | 0x00000010));

        boolean b = spliterator.hasCharacteristics(0x00000010);
        System.out.println(b);


    }

}
