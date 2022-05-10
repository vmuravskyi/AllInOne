package design_patterns.design_patterns_udemy.decorator.dynamic_decorator_composition;

class TransparentShape implements Shape {

    private Shape shape;
    private int transparency;

    public TransparentShape(Shape shape, int transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " and has "
                + transparency + "% transparency";
    }
}
