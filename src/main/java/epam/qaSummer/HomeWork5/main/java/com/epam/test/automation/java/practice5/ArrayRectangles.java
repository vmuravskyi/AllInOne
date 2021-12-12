package epam.qaSummer.HomeWork5.main.java.com.epam.test.automation.java.practice5;
import java.util.Arrays;

public class ArrayRectangles {

    private Rectangle[] rectangles;

    public ArrayRectangles(int n) {
        this.rectangles = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle... rectangles) {
        this.rectangles = rectangles;
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i] == null) {
                rectangles[i] = rectangle;
                return true;
            }
        }
        return false;
    }


    public int numberMaxArea() {
        double area = rectangles[0].area();
        int index = 0;
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i] != null && rectangles[i].area() > area) {
                area = rectangles[i].area();
                index = i;
            }
        }
        return index;
    }


    public int numberMinPerimeter() {
        double perimeter = rectangles[0].perimeter();
        int index = 0;
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i] != null && rectangles[i].perimeter() < perimeter) {
                perimeter = rectangles[i].perimeter();
                index = i;
            }
        }
        return index;
    }


    public int numberSquares() {
        int number = 0;
        for (Rectangle rectangle : rectangles) {
            if (rectangle.isSquare()) {
                number++;
            }
        }
        return number;
    }


    @Override
    public String toString() {
        return "ArrayRectangles{" +
                "rectangles=" + Arrays.toString(rectangles) +
                '}';
    }
}