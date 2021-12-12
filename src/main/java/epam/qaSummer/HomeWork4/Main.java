package epam.qaSummer.HomeWork4;

public class Main {
    public static void main(String[] args) {
        /**
         * Sonar wants a comment here:)
         */

        int[] arr1 = null;
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1};
        int[] arr3 = {1, 5, 7, 9, 8, 4, 3};
        int[] test = {1, 2, 3, 4, 5, 6, 7};


//        System.out.println(Task1.isSorted(null, SortOrder.ASC));
//        System.out.println(Arrays.toString(Task2.transform(arr1, SortOrder.DESC)));
//        System.out.println(Task3.multiArithmeticElements(4,-6,0));
//        System.out.println(Task3.multiArithmeticElements(7,6,6));
        System.out.println(Task4.sumGeometricElements(10, 0.5, 20));
    }
}
