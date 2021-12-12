package epam.qaSummer.lesson07;

class YellowFlower implements ColorAble {

    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public void setColor(String color) {
        throw new IllegalArgumentException("Yellow change color");
    }
}

public class ProgramFigure {
    private static void printColor(ColorAble colorAble) {
        System.out.println(colorAble.getColor());
        System.out.println(colorAble.BLACK);
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        ColorPoint cp1 = new ColorPoint(3, 3, "red");

        Point[] points = new Point[4];
        points[0] = p1;
        points[1] = cp1;
        points[2] = new Point(4, 4);
        points[3] = new Point3D(6, 7, 8);

        for (Point p : points) {
            System.out.println(p);
        }

        Line l1 = new Line(p1, points[2]);
        Line l2 = new Line(7, 7, 8, 8);
        Line l3 = new Line(new Point(9, 9), new Point(10, 10));

        ColorLine cl = new ColorLine(new Point(11, 11), new Point(12, 12), "green");
        ColorLine cl2 = new ColorLine(l2, "yellow");

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println("************************************************");
        Line[] lines = {l1, l2, l3, cl, cl2};

        for (var l : lines) {
            System.out.println(l);
        }
        System.out.println("************************************************");

        AbstractFigure[] figures = {p1, cp1, l1, cl};
        for (var o : figures) {
            System.out.println(o);
        }
        System.out.println("**************************************************");

        ColorAble[] colors = {cp1, cl, new YellowFlower(), new ColorAble() {
            private String color;

            @Override
            public String getColor() {
                return color;
            }

            @Override
            public void setColor(String color) {
                this.color = color;
            }
        }, new YellowFlower()};
        for (var colorObj : colors) {
            printColor(colorObj);
        }
    }
}
