package functional_reactive_programming_java.section07;

import java.util.Optional;

public class MoreOperation {

    public static void main(String[] args) {

        // ifPresent
        Optional<String> optional = Optional.of("Value");
        optional.ifPresent(s -> System.out.println("This is a " + s));

        // ifPresentOrElse
        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));

        // stream
        optional.stream().forEach(System.out::println);
        Optional.empty().stream().forEach(System.out::println);

        // or
        optional.or(() -> Optional.of("New Value")).ifPresent(System.out::println);
        Optional.empty().or(() -> Optional.of("New Value")).ifPresent(System.out::println);

        // equals (optional, either both are empty, or if the values ib optional are equals to each other via equals method)
        System.out.println(optional.equals(Optional.of("Value")));

        //hashcode
        System.out.println(optional.hashCode());
        System.out.println(Optional.empty().hashCode());
    }
}
