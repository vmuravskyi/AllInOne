package functional_reactive_programming_java.section04;

public class LambdaPractice1 {

    public static void main(String[] args) {

        Name name = () -> System.out.println("Volodymyr");
        name.myName();
    }
}
