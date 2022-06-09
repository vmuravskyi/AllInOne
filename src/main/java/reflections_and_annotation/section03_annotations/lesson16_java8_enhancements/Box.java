package reflections_and_annotation.section03_annotations.lesson16_java8_enhancements;

import jakarta.validation.constraints.NotEmpty;

public class Box<@NotEmpty T> {
    @NotEmpty int size;
    T type;

    public Box(int size, T type) {
        this.size = size;
        this.type = type;
    }

    class NestedBox extends Box<T> {
        NestedBox(int size, @NotEmpty T type) {
            super(size, type);
        }
    }
}
