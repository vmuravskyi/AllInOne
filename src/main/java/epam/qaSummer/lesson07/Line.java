package epam.qaSummer.lesson07;

public class Line extends AbstractFigure{
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, x2);
        this.end = new Point(y1, y2);
    }

    public Line(Line line) {
        this.start = line.getStart();
        this.end = line.getEnd();
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}' + super.toString();
    }
}
