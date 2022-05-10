package old.enumexample.enumFunctionalInterfaces;

public class Runner {
    public static void main(String[] args) {
        RectangleParam rectangleParam = RectangleParam.PERIMETER;

        RectangleAction rectangleAction = new RectangleAction();
        double result = rectangleAction.action(RectangleParam.PERIMETER, 1.0, 7.0);
        System.out.println(result);
    }
}
