package epam.qaSummer.HomeWork4;

import java.util.Arrays;

public class Task1 {

    private Task1() {
        /**
         * Sonar wants a comment here:)
         */
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static boolean isSorted(int[] arr, SortOrder order) {

        validation(arr, order);

        boolean result = false;
        int[] arrClone = arr.clone();

        switch (order) {
            case ASC:
                int[] arrCloneASC = bubbleSortASC(arrClone);
                if (Arrays.equals(arr, arrCloneASC)) {
                    result = true;
                }
                break;
            case DESC:
                int[] arrCloneDESC = bubbleSortDESC(arrClone);
                if (Arrays.equals(arr, arrCloneDESC)) {
                    result = true;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + order);
        }
        return result;
    }

    public static int[] bubbleSortASC(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSortDESC(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr;
    }


    private static void validation(int[] arr, SortOrder order) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException();
        if (order == null) throw new IllegalArgumentException();
    }
}
