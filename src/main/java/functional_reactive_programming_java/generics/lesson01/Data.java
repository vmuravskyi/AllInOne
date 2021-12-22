package functional_reactive_programming_java.generics.lesson01;

class BaseData<T> {}

public class Data<T> extends BaseData<T> implements IData<T> {

    private T t;

    public Data(T t) {
        this.t = t;
    }

    @Override
    public T getT() {
        return t;
    }

    @Override
    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "data is: " + t;
    }

}
