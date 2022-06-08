package java_object_oriented_programming.section05_design_principles.lesson40_liskov_substitution_principle;

class Bird {
    // base functionality related to bird
    public void info() {
        System.out.println("I am a bird");
    }

}

class FlyingBird extends Bird {

    public void fly() {
        System.out.println("I am a flying bird");
    }

}

class Sparrow extends FlyingBird {

}

class Ostrich extends Bird {

}

public class LspExecutor {

    public static void main(String[] args) {

        Ostrich ostrich = new Ostrich();
        ostrich.info();

        Sparrow sparrow = new Sparrow();
        sparrow.fly();

    }

}
