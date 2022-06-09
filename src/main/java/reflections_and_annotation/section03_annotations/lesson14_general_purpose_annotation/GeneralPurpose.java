package reflections_and_annotation.section03_annotations.lesson14_general_purpose_annotation;

import functional_reactive_programming_java.section08.composition.Function;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Parent {

    public void m1() {
        System.out.println("m1 parent implementation");
    }

    @Deprecated(since = "2.1.12", forRemoval = false)
    public void m2(int a) {
        System.out.println("m2 parent implementation, a = " + a);
    }

}

@FunctionalInterface
interface MyFunctionalInterface {
    void apply();
}

public class GeneralPurpose extends Parent {

    @Override
    public void m1() {
        System.out.println("m1 child implementation");
    }

    public static void main(String[] args) {

        //@SuppressWarnings("unused")
        int a = 10;

        @SuppressWarnings({"rawtypes", "unused"})
        ArrayList aList = new ArrayList();

        GeneralPurpose generalPurpose = new GeneralPurpose();
        generalPurpose.m2(a);


        @SuppressWarnings({"UnnecessaryBoxing", "CachedNumberConstructorCall"})
        Integer i = new Integer(0);

        MyFunctionalInterface multiplyByTwo = () -> System.out.println("Method invoked");
        multiplyByTwo.apply();

    }


}


