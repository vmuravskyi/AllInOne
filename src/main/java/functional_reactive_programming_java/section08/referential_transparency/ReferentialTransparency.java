package functional_reactive_programming_java.section08.referential_transparency;

public class ReferentialTransparency {

    public static void main(String[] args) {

        int result = add(2, multiply(2, multiply(2, 2)));
        System.out.println(result);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        System.out.println("Multiplying a and b: " + a + ", " + b);
        return a * b;
    }
}
