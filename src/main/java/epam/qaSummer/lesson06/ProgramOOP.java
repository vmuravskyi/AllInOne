package epam.qaSummer.lesson06;

public class ProgramOOP {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println(p);

        Point p1 = new Point();

        Cat c = new Cat("Tom", 12, 7);
        System.out.println(c);

        PolyPoint pp = new PolyPoint();

        pp.add(p);
        pp.add(p1);

        System.out.println(pp);
    }
}
