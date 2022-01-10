package functional_reactive_programming_java.section09.builder;

import java.util.function.Consumer;

public class MobileBuilder {

    int ram, storage, battery, camera;
    String processor;
    double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
        buildFields.accept(this);
        return this;
    }

    public Mobile createMobile() {
        return new Mobile(this);
    }
}
