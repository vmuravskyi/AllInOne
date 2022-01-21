package functional_reactive_programming_java.section14;

import com.sun.source.tree.Tree;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetFunctionalOperations {

    public static void main(String[] args) {

        Set<Integer> set = Set.of(3, 56, 55, 7, 82, 39, 76, 567);

        // Traversal
        set.forEach(System.out::println);

        System.out.println("-------------------- Traversal -------------------------");

        // Filter
        set.stream()
            .filter(integer -> integer % 2 == 0)
            .forEach(System.out::println);

        System.out.println("-------------------- Sorting -------------------------");

        // Sorting
        set.stream()
            .sorted(Integer::compareTo)
            .forEach(System.out::println);

        System.out.println("---------------------------------------------");

        TreeSet<Integer> treeSet = set.stream()
            .collect(Collectors.toCollection(TreeSet::new));
        treeSet.forEach(System.out::println);

        System.out.println("-------------------- Map -------------------------");

        // Map
        Set<Double> hashSet = set.stream()
            .map(Double::valueOf)
            .collect(Collectors.toSet());
        hashSet.forEach(System.out::println);

        System.out.println("-------------------- Reduce -------------------------");

        // Reduce
        int sum1 = set.stream()
            .mapToInt(value -> value)
            .sum();
        System.out.println(sum1);
    }

}
