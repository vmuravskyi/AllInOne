package java_object_oriented_programming.section05_design_principles.lesson39_open_closed_principle;

abstract class Shape {

    public abstract void calculate();

}

class Rectangle extends Shape {

    public double height;
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

}

class Circle extends Shape {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

}

class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }
}

class AreaCalculator {

    Object shape;

    public AreaCalculator(Object shape) {
        this.shape = shape;
    }

    public void calculate() {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            System.out.println(r.height * r.width);
        }
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            System.out.println(Math.PI * Math.pow(c.radius, 2));
        }
        if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            System.out.println(0.5 * t.base * t.height);
        }
    }

}

public class Area {

    public static void main(String[] args) {

        AreaCalculator calc = new AreaCalculator(new Rectangle(3,4));
        calc.calculate();

        AreaCalculator calculator = new AreaCalculator(new Circle(3));
        calculator.calculate();



    }

}
