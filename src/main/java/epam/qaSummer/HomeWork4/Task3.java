package epam.qaSummer.HomeWork4;

public class Task3 {

    private Task3() {
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
    public static int multiArithmeticElements(int a1, int t, int n) {
        validation(n);

        int sum = a1;
        int aPrevious = a1;
        for (int i = 1; i < n; i++) {
            int aNext = aPrevious + t;
            sum = sum * aNext;
            aPrevious = aPrevious + t;
        }
        return sum;
    }

    private static void validation(int n) {
        if (n <= 0) throw new IllegalArgumentException();
    }
}

