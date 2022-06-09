package reflections_and_annotation.section03_annotations.lesson16_java8_enhancements;

import jakarta.validation.constraints.NotEmpty;

public class Enhancements {

    public static void main(String[] args) {

        Box<String> box = new @NotEmpty @ReadOnly Box<>(10, "Container");
        box.new @ReadOnly NestedBox(15, "Cylinder");

    }

}
