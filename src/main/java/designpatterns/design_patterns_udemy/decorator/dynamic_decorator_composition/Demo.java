package designpatterns.design_patterns_udemy.decorator.dynamic_decorator_composition;

class Demo {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(
                new Square(20), "blue"
        );
        System.out.println(blueSquare.info());

        TransparentShape transparentCircle = new TransparentShape(
                new ColoredShape(new Circle(5), "green"), 50
        );
        System.out.println(transparentCircle.info());

    }

}
