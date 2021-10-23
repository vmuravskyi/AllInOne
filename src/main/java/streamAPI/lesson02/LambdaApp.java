package streamAPI.lesson02;

public class LambdaApp {
    public static <T> T getFirst(T[] strArr) {
        return strArr[0];
    }

    public static void main(String[] args) {
        String[] strArr = {"1", "2", "3"};

        System.out.println(getFirst(strArr));
    }
}
