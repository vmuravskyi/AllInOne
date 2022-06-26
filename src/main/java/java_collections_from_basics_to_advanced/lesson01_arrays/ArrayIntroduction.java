package java_collections_from_basics_to_advanced.lesson01_arrays;

public class ArrayIntroduction {

    public static void main(String[] args) {

        int a = 12;
        int b = 13;
        int c = 14;

        int[] x = new int['a'];

        System.out.println(x.length);
        // allowed byte, short, char, int -> all promoted to int

        int[] p = new int[-1];

        int[] r = new int[2147483647]; // max int value

    }

}
