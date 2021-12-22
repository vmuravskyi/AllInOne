package functional_reactive_programming_java.generics.lesson01;


interface IInterface<T> {}

class Class2<T> implements IInterface<T> {}

public class Class1<T> extends Class2<T> implements IInterface<T> {

}
