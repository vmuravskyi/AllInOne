package functional_reactive_programming_java.section03;

public class FuncInterfaceDemo {
    public static void main(String[] args) {

        MyFuncInterface func = () -> System.out.println("Hello");
        func.myMethod();

        onTheFly(() -> System.out.println("Hello2"));

    }

    public static void onTheFly(MyFuncInterface func) {
        func.myMethod();
    }
}
