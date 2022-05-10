package design_patterns.design_patterns_udemy.decorator.dynamic_decorator_composition;

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
