package functional_reactive_programming_java.section09.factoryMethod;

import java.util.function.Supplier;

public class FlooringFactory {

    public static Flooring getFlooring(int minTemperature, int maxTemperature) {

        Supplier<Flooring> flooring;

        if (minTemperature <= 5 && maxTemperature <= 20) {
            flooring = WoodingFlooring::new;
        } else if (minTemperature <= 5 && maxTemperature >= 45) {
            flooring = CorkFlooring::new;
        } else {
            flooring = ConcreteFlooring::new;
        }
        return flooring.get();

    }

}
