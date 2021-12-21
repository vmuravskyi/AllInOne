package designpatterns.udemyDmitry.factory.factory;

class Demo {

    public static void main(String[] args) {

        Point point = Point.PointFactory.newCartesianPoint(2, 3);

        Point point2 = Point.PointFactory.newPolarPoint(2, 3);

        System.out.println(point);
        System.out.println(point2);
    }
}
