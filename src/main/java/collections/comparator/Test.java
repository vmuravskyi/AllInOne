package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("a");
        animals.add("frog");
        animals.add("q");
        animals.add("bird");
        animals.add("bidder");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);


        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(500);
        numbers.add(999);
        numbers.add(12);
        numbers.add(9);
        numbers.add(55);

        System.out.println(numbers);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(numbers);

        numbers.sort((o1, o2) -> {
            return o2.compareTo(o1);
        });


        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Volodymyr"));
        people.add(new Person(2, "Ivan"));
        people.add(new Person(3, "Petro"));
        people.add(new Person(4, "Vasyl"));
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getName().length(), o2.getName().length());
            }
        });
        System.out.println(people);
    }
}

