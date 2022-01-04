package functional_reactive_programming_java.section08.higher_order_functions;

public interface IConfigurator<T, R> {
    R configure(T t);
}
