package epam.qaSummer.HomeWork4;

public class Task4 {

    private Task4() {
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
     * РЕЗУЛЬТАТ ОКРУГЛИТИ ДО ЦІЛОГО
     */
    public static double sumGeometricElements(int a1, double t, int alim) {

        validation(a1, t, alim);

        double sum = a1;
        double aNext;
        double aPrevious = a1;

        do {
            aNext = aPrevious * t;
            sum = sum + aNext;
            aPrevious = aPrevious * t;
        } while (aNext * t > alim && aNext > 0.00000000000000001);
        return Math.round(sum);
    }

    private static void validation(int a1, double t, int alim) {
        if (t <= 0 || t >= 1 || a1 <= 0 || alim < 0 || a1 <= alim) throw new IllegalArgumentException();
    }
}

