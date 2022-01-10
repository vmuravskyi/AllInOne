package functional_reactive_programming_java.section08.composition;

import designpatterns.design_patterns__and_solid_principles.solid.liskov.Square;

public class Composition {

    public static void main(String[] args) {

        Function<Square, Integer> function1 = Square::getArea;
        Function<Integer, Double> function2 = Math::sqrt;

        Function<Square, Double> getSide = function2.compose(function1);

        Square testSquare = new Square(10);
        Double side = getSide.apply(testSquare);
        System.out.println(side);


    }
}
