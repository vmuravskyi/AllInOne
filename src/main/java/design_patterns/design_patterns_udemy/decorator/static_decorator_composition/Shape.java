package design_patterns.design_patterns_udemy.decorator.static_decorator_composition;

import java.util.function.Supplier;

interface Shape {
    String info();
}

class Circle implements Shape {

    private float radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    void resize(float factor) {
        radius *= factor;
    }

    @Override
    public String info() {
        return "A circle of radius " + radius;
    }
}

class Square implements Shape {
    private float side;

    public Square() {
    }

    public Square(float side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "A square with side " + side;
    }
}

class ColoredShape<T extends Shape> implements Shape {

    private final Shape shape;
    private final String color;

    public ColoredShape(Supplier<? extends T> ctor,
                        String color) {
        shape = ctor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color " + color;
    }
}

class TransparentShape<T extends Shape> implements Shape {

    private final Shape shape;
    private final int transparency;

    public TransparentShape(Supplier<? extends T> ctor, int transparency) {
        this.shape = ctor.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " and transparency " + transparency;
    }
}

class Demo {

    public static void main(String[] args) {

        ColoredShape<Square> blueSquare =
                new ColoredShape<>(() -> new Square(20), "blue");
        System.out.println(blueSquare.info());


        TransparentShape<Shape> transparentColoredCircle =
                new TransparentShape<>(() ->
                        new ColoredShape<>(() ->
                                new Circle(5.5f), "green"), 50);
        System.out.println(transparentColoredCircle.info());
    }

}

