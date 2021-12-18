package Functional_Reactive_programming.generics;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {

    public static void main(String[] args) {

        Object o = new Object();
        Integer i = Integer.valueOf(11);
        o = i;

        List<Number> list = new ArrayList<>();
        list.add(Integer.valueOf(10));
        list.add(Double.valueOf(10.55));
//        list.add("Hello");


    }
}
