package lesson6;

public class ProgramOOP {
    public static void main(String[] args) {
        Point p = new Point(5, 10);

        p.setX(10);
        p.setY(20);
        p.print();

        System.out.println(p.toString());

        Cat cat = new Cat("Bob", 5, 3.45);
        System.out.println(cat);

        PolyPoint pp = new PolyPoint();
        pp.add(p);
        pp.add(new Point(3,3));

        System.out.println(pp.size());
        System.out.println(pp);
    }
}
