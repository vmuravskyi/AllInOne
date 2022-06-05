package java_object_oriented_programming.section03_object_oriented_programming_concepts.lesson18_overloading;

class Addition {
    public void sum(int a, int b) {
        System.out.println("Result: " + (a + b));
    }

    public void sum(int a, int b, int c) {
        System.out.println("Result: " + (a + b + c));
    }

    public void sum(double a, int b, int c) {
        System.out.println("Result: " + (a + b + c));
    }
}

public class OverloadingDemo {

    public static void main(String[] args) {

    Addition add = new Addition();
    add.sum(10, 15);
    add.sum(10, 15, 20);
    add.sum(10.1f, 15, 20);
    add.sum(0b1111, 15, 20);

    /**
        byte -> short -> int -> long -> float -> double
                          ^
                          |
                        char
     */
    }

}
