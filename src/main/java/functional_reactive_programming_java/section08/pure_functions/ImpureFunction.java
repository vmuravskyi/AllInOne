package functional_reactive_programming_java.section08.pure_functions;

public class ImpureFunction {

    private int value = 0;

    public int add(int nextValue) {
        this.value += nextValue;
        return this.value;
    }
}
