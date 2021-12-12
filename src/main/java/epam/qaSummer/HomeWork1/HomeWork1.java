package epam.qaSummer.HomeWork1;

public class HomeWork1 {

    private HomeWork1() {
    }

    public static int task1(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            return n * n;
        } else return Math.abs(n);
    }

    public static int task2(int n) {
        int a = n / 100;
        int b = n % 100 / 10;
        int c = (n % 100) % 10;

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid = getMid(a, b, c);

        return (max * 100) + (mid * 10) + min;
    }

    private static int getMid(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (a+b+c)-(max+min);
    }

    public static void main(String[] args) {
        System.out.println(task1(475));
    }

}
//
//
//
//
//    public static void main(String[] args) {
//
//        int result = task1(0);
//        System.out.println(result);
//    }
