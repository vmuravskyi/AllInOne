package design_patterns.design_patterns__and_solid_principles.solid.liskov;

public class Square implements Shape {

    private int side;
    private int area;

    public Square(int side) {
        this.side = side;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int computeArea() {
        return side * side;
    }

    public int getArea() {
        return side * side * side * side;
    }
}
