package epam.qaSummer.HomeWork5.test.java.com.epam.test.automation.java.practice5;

import epam.qaSummer.HomeWork5.main.java.com.epam.test.automation.java.practice5.ArrayRectangles;
import epam.qaSummer.HomeWork5.main.java.com.epam.test.automation.java.practice5.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());

        Rectangle rectangle1 = new Rectangle(2,4);
        Rectangle rectangle2 = new Rectangle(3,4);
        Rectangle rectangle3 = new Rectangle(4,4);

        ArrayRectangles arr = new ArrayRectangles(rectangle1, rectangle2, rectangle3);
        System.out.println(arr.numberMaxArea());
        System.out.println(arr.numberMinPerimeter());
        System.out.println(arr.numberSquares());

    }
}