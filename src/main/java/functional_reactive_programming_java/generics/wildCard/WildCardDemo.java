package functional_reactive_programming_java.generics.wildCard;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

    public static <T> void displayData(List<?> list) {
        for (Object t : list) {
            System.out.println(t);
        }

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(55);
        list.add(876);
    }
}
