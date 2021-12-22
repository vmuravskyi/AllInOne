package designpatterns.design_patterns_other.other.singleton;

public class Singleton {
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);

        Runtime anotherRuntime = Runtime.getRuntime();
        System.out.println(anotherRuntime);

        if (singletonRuntime == anotherRuntime)
            System.out.println("Same object");
    }
}
