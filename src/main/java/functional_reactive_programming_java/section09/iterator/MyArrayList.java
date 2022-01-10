package functional_reactive_programming_java.section09.iterator;

import functional_reactive_programming_java.section08.chaining.Consumer;

public class MyArrayList {
    Object[] elements = new Object[5];

    public MyArrayList(Object[] elements) {
        this.elements = elements;
    }

    public void forEach(Consumer action) {
        for (Object element : elements) {
            action.accept(element);

        }
    }
}
