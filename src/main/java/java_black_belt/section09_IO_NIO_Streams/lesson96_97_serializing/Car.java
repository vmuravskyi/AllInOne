package java_black_belt.section09_IO_NIO_Streams.lesson96_97_serializing;

import com.google.common.base.MoreObjects;
import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 4209550995519138996L;

    private String color;
    private String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("color", color)
            .add("model", model)
            .toString();
    }

}
