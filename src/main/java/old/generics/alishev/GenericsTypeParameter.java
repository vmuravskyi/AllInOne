package old.generics.alishev;

public class GenericsTypeParameter {

}

class Class1<T extends Number> {

    void print(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        Class1<Number> c = new Class1<>();

        c.print(1);
    }
}
