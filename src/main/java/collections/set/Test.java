package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("Mike");
        set1.add("Katy");
        set1.add("Tom");
        set1.add("George");
        set1.add("Donald");
        set1.add("Tom");
        set1.add("Tom");

        Set<String> set2 = new HashSet<>();

        set2.add("Вова");
        set2.add("Іван");
        set2.add("Петро");
        set2.add("Василь");
        set2.add("Максим");
        set2.add("Donald");

        // union
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        // intersection

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        // difference

        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);

    }


}
