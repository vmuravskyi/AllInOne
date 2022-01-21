package functional_reactive_programming_java.section14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MapFunctionalOperations {

    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap<>();
        contacts.put("1237589020", "John");
        contacts.put("1237009020", "John");
        contacts.put("7890291111", "Neal");
        contacts.put("2647210290", "Raju");
        contacts.put("9999999999", "Peter");
        contacts.put("9081234567", "Neha");

        // Traversal
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("");
        contacts.forEach((s, s2) -> System.out.println(s + " : " + s2));

        System.out.println("-------------------- Filter ---------------------------");

        // Filter
        Map<String, String> toMap = contacts.entrySet().stream()
            .filter(contact -> contact.getValue().equals("John"))
            .collect(Collectors.toMap(contact -> contact.getKey(), contact -> contact.getValue()));
        toMap.entrySet().forEach(System.out::println);

        System.out.println("-------------------- Map ---------------------------");

        // Map
        String contactNames = contacts.entrySet().stream()
            .distinct()
            .map(contact -> contact.getValue())
            .collect(Collectors.joining(","));
        System.out.println(contactNames);

        System.out.println("-------------------- Sort ---------------------------");

        // Sort
        LinkedHashMap<String, String> sortedMap = contacts.entrySet().stream()
            .sorted(Entry.comparingByValue())
            .collect(Collectors.toMap(c -> c.getKey(), c -> c.getValue(), (c1, c2) -> c1, LinkedHashMap::new));
        sortedMap.forEach((s, s2) -> System.out.println(s + " : " + s2));

        System.out.println("-------------------- Reduce ---------------------------");

        // Reduce
        OptionalDouble average = contacts.values().stream()
            .map(String::length)
            .mapToDouble(value -> value)
            .average();
        System.out.println(average.getAsDouble());
    }

}
