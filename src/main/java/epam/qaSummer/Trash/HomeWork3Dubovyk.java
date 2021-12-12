//
//public class HomeWork3Dubovyk {
//
//    private static final String ARRAY_IS_NOT_INITIALIZED = "Array is not initialized!";
//    private static final String ARRAY_IS_EMPTY = "Array is empty!";
//    private static final String MATRIX_SHOULD_BE_SQUARE = "Matrix should be square!";
//
//    /**
//     * <summary>
//     * Private constructor to please sonarqube
//     * </summary>
//     */
//    private HomeWork3Dubovyk() {
//    }
//
//    /**
//     * <summary>
//     * Implement code according to description of task 1.
//     * </summary>
//     */
//    public static int[] task1(int[] array) {
//        if (array == null) throw new NullPointerException(ARRAY_IS_NOT_INITIALIZED);
//        for (var i = 0; i < array.length / 2; i++) {
//            if (array[i] % 2 + array[array.length - i - 1] % 2 == 0) {
//                var temp = array[array.length - i - 1];
//                array[array.length - i - 1] = array[i];
//                array[i] = temp;
//            }
//        }
//        return array;
//    }
//
//    /**
//     * <summary>
//     * Implement code according to description of task 2.
//     * </summary>
//     */
//    public static int task2(int[] array) {
//        if (array == null) throw new NullPointerException(ARRAY_IS_NOT_INITIALIZED);
//        if (array.length == 0) throw new IllegalArgumentException(ARRAY_IS_EMPTY);
//        int max;
//        int firstOccurrence;
//        int lastOccurrence;
//        max = array[0];
//        firstOccurrence = lastOccurrence = 0;
//        for (var i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//                firstOccurrence = lastOccurrence = i;
//            } else if (array[i] == max) lastOccurrence = i;
//        }
//        return lastOccurrence - firstOccurrence;
//    }
//
//    /**
//     * <summary>
//     * Implement code according to description of task 3.
//     * </summary>
//     */
//    public static int[][] task3(int[][] matrix) {
//        if (matrix == null) throw new NullPointerException(ARRAY_IS_NOT_INITIALIZED);
//        for (var i = 0; i < matrix.length; i++) {
//            if (matrix[i] == null) throw new NullPointerException(ARRAY_IS_NOT_INITIALIZED);
//            if (matrix.length != matrix[i].length) throw new IllegalArgumentException(MATRIX_SHOULD_BE_SQUARE);
//            for (var j = 0; j < matrix[i].length; j++) {
//                if (i > j) matrix[i][j] = 0;
//                else if (i < j) matrix[i][j] = 1;
//            }
//        }
//        return matrix;
//    }
//
//}
//*/
//
//import org.testng.annotations.Test;
//
//import static com.epam.test.automation.java.practice3.Main.*;
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertThrows;
//
//public class MainTest {
//    @Test
//    public void task1NullPointer() {
//        assertThrows(NullPointerException.class, () -> task1(null));
//    }
//
//    @Test
//    public void task1WithEmptyArray() {
//        int[] arr = {};
//        task1(arr);
//        assertEquals(arr, new int[]{});
//    }
//
//    @Test
//    public void task1WithArray10_5_3_4() {
//        int[] arr = {10, 5, 3, 4};
//        task1(arr);
//        assertEquals(arr, new int[]{4, 5, 3, 10});
//    }
//
//    @Test
//    public void task1WithArray100_2_3_4_5() {
//        int[] arr = {100, 2, 3, 4, 5};
//        task1(arr);
//        assertEquals(arr, new int[]{100, 4, 3, 2, 5});
//    }
//
//    @Test
//    public void task1WithArray100_2_3_45_33_8_4_54() {
//        int[] arr = {100, 2, 3, 45, 33, 8, 4, 54};
//        task1(arr);
//        assertEquals(arr, new int[]{54, 4, 3, 45, 33, 8, 2, 100});
//    }
//
//    @Test
//    public void task2WithNullPointer() {
//        assertThrows(NullPointerException.class, () -> task2(null));
//    }
//
//    @Test
//    public void task2WithEmptyArray() {
//        assertThrows(IllegalArgumentException.class, () -> task2(new int[]{}));
//    }
//
//    @Test
//    public void task2WithArray4_100_3_4() {
//        assertEquals(task2(new int[]{4, 100, 3, 4}), 0);
//    }
//
//    @Test
//    public void task2WithArray5_50_50_4_5() {
//        assertEquals(task2(new int[]{5, 50, 50, 4, 5}), 1);
//    }
//
//    @Test
//    public void task2WithArray5_350_350_4_350() {
//        assertEquals(task2(new int[]{5, 350, 350, 4, 350}), 3);
//    }
//
//    @Test
//    public void task2WithArray10_10_10_10_10() {
//        assertEquals(task2(new int[]{10, 10, 10, 10, 10}), 4);
//    }
//
//    @Test
//    public void task3WithNullPointer() {
//        assertThrows(NullPointerException.class, () -> task3(null));
//    }
//
//    @Test
//    public void task3WithEmptyMatrix() {
//        int[][] actResult = task3(new int[][]{});
//        assertEquals(actResult.length, 0);
//    }
//
//    @Test
//    public void task3WithRectangularMatrix() {
//        int[][] matrix = {
//                {1, 2},
//                {3, 4},
//                {5, 6}
//        };
//        assertThrows(IllegalArgumentException.class, () -> task3(matrix));
//    }
//
//    @Test
//    public void task3WithJaggedMatrix() {
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6, 7},
//                {8, 9, 10}
//        };
//        assertThrows(IllegalArgumentException.class, () -> task3(matrix));
//    }
//
//    @Test
//    public void task3SquareMatrix() {
//        int[][] expResult = {
//                {2, 1, 1, 1},
//                {0, 7, 1, 1},
//                {0, 0, 3, 1},
//                {0, 0, 0, 5}
//        };
//        int[][] actResult = task3(new int[][]{
//                {2, 4, 3, 3},
//                {5, 7, 8, 5},
//                {2, 4, 3, 3},
//                {5, 7, 8, 5}
//        });
//        for (int i = 0; i < actResult.length; i++) {
//            assertEquals(actResult[i], expResult[i]);
//        }
//    }
//}
