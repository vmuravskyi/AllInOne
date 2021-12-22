package functional_reactive_programming_java.generics;

public class GenericMethodDemo {

    public static <T> String concat(T data) {
        return "Data is: " + data;
    }

    public static void main(String[] args) {

        System.out.println(concat("Hello"));
        System.out.println(concat(123));

    }

}
