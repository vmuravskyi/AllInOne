package functional_reactive_programming_java.section07;

import java.util.Optional;

public class Unwrap {

    public static void main(String[] args) {

        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);

        // get
        Integer integerVal = optional.get();
        System.out.println(integerVal);

        Optional<Integer> emptyOptional = Optional.empty();


        // is Present
        Integer val = emptyOptional.isPresent() ? optional.get() : 0;
        System.out.println(val);

        // orElse, orElseGet

        // orElse
        Integer orElse = optional.orElse(0);
        Integer orElseNull = emptyOptional.orElse(0);
        System.out.println(orElse);
        System.out.println(orElseNull);

        // orElseGet
        Integer orElseGet = emptyOptional.orElseGet(() -> 100);
        System.out.println(orElseGet);

        // orElseThrow
        Integer orElseThrow = emptyOptional.orElseThrow(() -> new IllegalArgumentException());
        System.out.println(orElseThrow);

        // orElseThrow() = get().

    }
}
