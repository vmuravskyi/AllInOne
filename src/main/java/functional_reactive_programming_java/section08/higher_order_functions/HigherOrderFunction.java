package functional_reactive_programming_java.section08.higher_order_functions;

public class HigherOrderFunction {

    public static void main(String[] args) {

        IFactory<Integer> factory = createFactory(() -> Math.random() * 100, r -> r.intValue());
        Integer product = factory.create();
        System.out.println(product);


    }

    public static <T, R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T, R> configurator) {

        return () -> {
            T t = producer.produce();
            return configurator.configure(t);
        };

    }
}
