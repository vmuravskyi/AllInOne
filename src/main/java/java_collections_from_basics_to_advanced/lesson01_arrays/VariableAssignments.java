package java_collections_from_basics_to_advanced.lesson01_arrays;

public class VariableAssignments {

    public static void main(String[] args) {
        int[] x = new int[2];
        int[] a = x;

        x[0] = 1;

        System.out.println(x[0]);
        System.out.println(a[0]);
        a[1] = 2;
        System.out.println(x[1]);
        System.out.println(a[1]);

        // --------------------------------------

        int[] b = {1, 2, 3};
        int[] c = {11, 22};

        c = b;
        int[] d = c;
        System.out.println(d[0]);


        String[] s = new String[3];
        Object[] objArr = s;

        // not allowed to promote short[] class to int[] class
        short[] shortArr = new short[2]; // [S
        // int[] intArr = shortArr;         // [I

        // but allowed
        int[] intArr = new int[2];
        intArr[0] = shortArr[0];


    }

}
