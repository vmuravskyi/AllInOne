package epam.qaSummer.lesson08.hotel;

public abstract class AbstractRoom {
    static int id = 0;
    private int currId;
    private String name;
    private double square;

    public AbstractRoom(double square, String name) {
        currId = ++id;
        this.square = square;
        this.name = name;
    }

    public AbstractRoom(double square) {
        this(square, "room");
    }

    public AbstractRoom() {
        this(0);
    }

    public AbstractRoom(String name) {
        this(0, name);
    }

    public int getCurrId() {
        return currId;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return this.square;
    }

    @Override
    public String toString() {
        return "currId=" + currId;
    }
}
