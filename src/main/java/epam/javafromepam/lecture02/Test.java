package epam.javafromepam.lecture02;

public class Test {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        for (int i = 1; i <= 9; i++) {
            a = i;
            for (int j = 1; j <= 9; j++) {
                b = j;
                c = i * j;
                System.out.printf(a + "*" + b + " = " + c + " ");
            }
            System.out.println();
        }
    }
}
