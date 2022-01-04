package functional_reactive_programming_java.section08.pure_functions;

class Demo {

    public static void main(String[] args) {

        int add = add(multiply(2, 3), multiply(3, 4));
        System.out.println(add);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        log(String.format("Returning %s as the result of %s * %s", a * b, a, b));
        return a * b;
    }

    public static void log(String s) {
        System.out.println(s);
    }

}
