package designpatterns.iterator;

import java.util.Iterator;

public class SimpleIterator<T> implements Iterator<T> {
    private final T[] objects;
    private int index;

    public SimpleIterator(T[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public T next() {
        return objects[index++];
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        SimpleIterator<Integer> simpleIterator = new SimpleIterator<>(integers);

        while (simpleIterator.hasNext()) {
            System.out.println(simpleIterator.next());
        }
    }
}
