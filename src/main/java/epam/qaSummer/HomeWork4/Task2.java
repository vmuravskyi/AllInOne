package epam.qaSummer.HomeWork4;

public class Task2 {

    private Task2() {
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
    public static int[] transform(int[] arr, SortOrder order) {

        validation(arr, order);

        boolean input;
        input = Task1.isSorted(arr, order);

        if (input) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + i;
            }
        }
        return arr;
    }

    private static void validation(int[] arr, SortOrder order) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException();
        if (order == null) throw new IllegalArgumentException();
    }
}

