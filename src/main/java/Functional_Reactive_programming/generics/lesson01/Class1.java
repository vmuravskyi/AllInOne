package Functional_Reactive_programming.generics.lesson01;


interface IInterface<T> {}

class Class2<T> implements IInterface<T> {}

public class Class1<T> extends Class2<T> implements IInterface<T> {

}
