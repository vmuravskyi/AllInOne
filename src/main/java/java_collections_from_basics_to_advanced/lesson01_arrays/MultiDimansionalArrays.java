package java_collections_from_basics_to_advanced.lesson01_arrays;

public class MultiDimansionalArrays {

    public static void main(String[] args) {

        int[][] x = new int[3][];

        x[0] = new int[3];
        x[1] = new int[3];
        x[2] = new int[3];


        int[][][] three = new int[2][][];

        three[0] = new int[3][];
        three[1] = new int[3][];

        three[0][0] = new int[3];
        three[0][1] = new int[1];
        three[0][2] = new int[2];

        three[1][0] = new int[3];
        three[1][1] = new int[1];
        three[1][2] = new int[2];

        three[0][0][0] = 1;

    }

}
