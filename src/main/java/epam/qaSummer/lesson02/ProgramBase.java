package epam.qaSummer.lesson02;

public class ProgramBase {

    public static int findMax(int x, int y) {
        if (x > y) return  x;
        else return y;
    }


    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        double z = 1.0*x/y;

        int myMax = findMax(findMax(findMax(1,3), 5), 6);
        System.out.println(myMax);

        System.out.println(Integer.MAX_VALUE);


    }
}
