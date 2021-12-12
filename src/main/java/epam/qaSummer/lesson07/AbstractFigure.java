package epam.qaSummer.lesson07;

public abstract class AbstractFigure {
    private static int id;

    static {
        id = 100;
    }

    private int curID;

    AbstractFigure() {
        curID = ++id;
    }

    public static int getId() {
        return id;
    }

    public int getCutId() {
        return curID;
    }

    @Override
    public String toString() {
        return "[" +
                "curID=" + getCutId() +
                "/" + getId() +
                ']';
    }
}
