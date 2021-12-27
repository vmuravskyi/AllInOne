package functional_reactive_programming_java.section04;

public class LampdaPractice2 {

    public static void main(String[] args) {

        MathOperation add = (a, b) -> System.out.println(a + b);
        add.operation(5, 5);

        MathOperation multiply = (a, b) -> System.out.println(a * b);
        multiply.operation(5, 5);

        MathOperation divide = (a, b) -> System.out.println(a / b);
        divide.operation(5, 5);

        MathOperation subtract = (a, b) -> System.out.println(a - b);
        subtract.operation(5, 5);


    }
}
