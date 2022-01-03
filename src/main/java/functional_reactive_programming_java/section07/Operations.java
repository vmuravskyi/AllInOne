package functional_reactive_programming_java.section07;

import java.util.Optional;

public class Operations {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Value");

        // map()
        String orElse = optional.map(s -> "Replaced").orElse("Empty");
        System.out.println(orElse);

        // filter()
        Optional<String> filter = optional.filter(s -> s.equalsIgnoreCase("Value"));
        System.out.println(filter.get());

        // flatMap()
        Optional<String> flatMap = optional.flatMap(s -> Optional.of("Replaced"));
        System.out.println(flatMap.get());
    }
}
