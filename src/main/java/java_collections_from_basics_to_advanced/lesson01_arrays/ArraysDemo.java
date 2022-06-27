package java_collections_from_basics_to_advanced.lesson01_arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] x;

        int[] y = {1, 2, 3, 4, 5};

        int[] z = new int[3];

        for (int el : y) {
            System.out.println(el);
        }
        System.out.println(y);

        // ---------------------------------------------------

        int[][] a;

        int[][] b = new int[2][];
        System.out.println(b[0]);
        //System.out.println(b[0][0]);

        b[0] = new int[2];
        b[0][0] = 1;
        b[0][1] = 2;

        System.out.println(b[0][0]);

        int[][] c = {
            {1, 2, 3},
            {2, 3, 4}
        };

        for (int[] array : c) {
            for (int el : array) {
                System.out.print(el + ", ");
            }
            System.out.println();
        }

    }

}
