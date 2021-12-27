package functional_reactive_programming_java.section05;

import java.util.function.Supplier;

public class SupplierPractice {

    public static void main(String[] args) {

        Supplier<String> structSupplier = () -> new String("A String");
        System.out.println(structSupplier.get());

        Supplier<Double> randomNumber = () -> Math.random() * 10;
        double randomDouble = Double.parseDouble(
                String.format("%.2f", randomNumber.get())
        );
        System.out.println(randomDouble);
    }
}
