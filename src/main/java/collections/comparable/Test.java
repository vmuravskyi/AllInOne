package collections.comparable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

//        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new Person(2, "To"));
        collection.add(new Person(1, "Bob"));
        collection.add(new Person(4, "George"));
        collection.add(new Person(3, "Katy"));
    }
}
