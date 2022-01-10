package functional_reactive_programming_java.section09.factoryMethod;

public class FactoryMethodPattern {

    public static void main(String[] args) {

        Flooring flooring = FlooringFactory.getFlooring(-1, 18);
        Flooring flooring2 = FlooringFactory.getFlooring(13, 46);
        flooring.installation();
        flooring2.installation();

    }

}
