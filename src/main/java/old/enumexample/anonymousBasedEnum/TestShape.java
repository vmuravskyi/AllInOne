package old.enumexample.anonymousBasedEnum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestShape {
    public static void main(String[] args) {
        List<Double> list = Arrays.stream(Shape.values())
                .map(Shape::computeSquare)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
