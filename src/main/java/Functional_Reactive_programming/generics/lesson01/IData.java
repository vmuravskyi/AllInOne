package Functional_Reactive_programming.generics.lesson01;

interface IBase<T> {}

public interface IData<T> extends IBase<T> {

    T getT();

    void setT(T t);

}
