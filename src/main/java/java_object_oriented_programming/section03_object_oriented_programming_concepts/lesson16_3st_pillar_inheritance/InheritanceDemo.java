package java_object_oriented_programming.section03_object_oriented_programming_concepts.lesson16_3st_pillar_inheritance;

// Single inheritance
class A {} // parent

class B extends A {} // child


// Multilevel inheritance
class C extends B {} // sub-child


// Multiple inheritance
interface AA {

    default void method() {
        System.out.println("Method of AA clas");
    }

}

interface AAA {

    default void method() {
        System.out.println("Method of AAA class");
    }

}

class BB implements AA, AAA {

    // there's an option to choose which method implementation to use
    @Override
    public void method() {
        AA.super.method();
        AAA.super.method();
    }

}


// Hierarchical inheritance A -> B, BB single parent, more than 1 child

// Hybrid: Multiple inheritance + Multi-level inheritance




public class InheritanceDemo {

    public static void main(String[] args) {



    }

}
