package functional_reactive_programming_java.generics.lesson01;

interface IBase<T> {}

public interface IData<T> extends IBase<T> {

    T getT();

    void setT(T t);

}
