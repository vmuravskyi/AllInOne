package functional_reactive_programming_java.section05;
@FunctionalInterface
public interface FunctionalGenerics<T, R> {
    R execute(T t);
}
