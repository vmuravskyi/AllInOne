package java_object_oriented_programming.section03_object_oriented_programming_concepts.lesson12_interface_and_abstract_class;

public interface InterfaceDemo {

    static final String a = "static constant";

    public void m1();

    public void m2();

    public void m3();

    default int m4() {
        return 0;
    }

    private void m5() {}

}

class Test implements InterfaceDemo {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}

