package java_object_oriented_programming.section05_design_principles.lesson39_open_closed_principle;

abstract class Shape {

    public abstract void calculateArea();

}

class Rectangle extends Shape {

    public double height;
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println(height * width);
    }

}

class Circle extends Shape {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }

}

class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    @Override
    public void calculateArea() {
        System.out.println(0.5 * base * height);
    }

}

class AreaCalculator {

    public static void calculate(Shape shape) {
        shape.calculateArea();
    }

}

public class Area {

    public static void main(String[] args) {

        AreaCalculator.calculate(new Rectangle(3, 4));
        AreaCalculator.calculate(new Circle(3));
        AreaCalculator.calculate(new Triangle(10, 5));
        
    }

}
