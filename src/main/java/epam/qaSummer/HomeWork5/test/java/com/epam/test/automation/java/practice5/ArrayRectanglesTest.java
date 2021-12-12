package epam.qaSummer.HomeWork5.test.java.com.epam.test.automation.java.practice5;

import epam.qaSummer.HomeWork5.main.java.com.epam.test.automation.java.practice5.ArrayRectangles;
import epam.qaSummer.HomeWork5.main.java.com.epam.test.automation.java.practice5.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayRectanglesTest {

    Rectangle rectangle1 = new Rectangle(2, 4);
    Rectangle rectangle2 = new Rectangle(3, 4);
    Rectangle rectangle3 = new Rectangle(4, 4);
    ArrayRectangles arr = new ArrayRectangles(rectangle1, rectangle2, rectangle3);

    @Test
    public void testNumberMaxArea() {
        Assertions.assertEquals(arr.numberMaxArea(), 2);
    }

    @Test
    public void testNumberMinPerimeter() {
        Assertions.assertEquals(arr.numberMinPerimeter(), 0);
    }

    @Test
    public void testNumberSquares() {
        Assertions.assertEquals(arr.numberSquares(), 1);
    }


}
