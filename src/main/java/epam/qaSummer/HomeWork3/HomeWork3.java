package epam.qaSummer.HomeWork3;

public class HomeWork3 {


    public static int[] task1(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            if ((arr[i] % 2) == 0 && (arr[arr.length - i - 1] % 2) == 0) {
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
        return arr;
    }


    public static int task2(int[] arr) {
        validation(arr);

        int max = findMax(arr);
        return countDistanceOfMaxFromFirstToLast(arr, max);
    }

    public static int[][] task3(int[][] arr) {
        validate2DArray(arr);

        for (var i = 0; i < arr.length; i++) {
            for (var j = 0; j < arr[i].length; j++) {
                if (i != j) {
                    if (j > i) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    private static void validate2DArray(int[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) throw new IllegalArgumentException();
    }


    private static void validation(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException();
    }


    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    private static int countDistanceOfMaxFromFirstToLast(int[] arr, int max) {
        int entry = -1;
        var exit = 0;
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                if (entry == -1) {
                    entry = i;
                } else {
                    exit = i;
                }
            }
        }
        if (exit - entry == -1) {
            return 0;
        }
        return exit - entry;
    }


    public static void main(String[] args) {
        int[] arr1 = {100, 2, 3, 45, 33, 8, 4, 54};
        task1(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int[] arr2 = {5, 350, 350, 4, 350};
        System.out.println(task2(arr2));

        int[][] arr3 = {{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}, {5, 7, 8, 5}};
        int[][] arr4 = {{2, -234, 3, 3}, {5, -1, 8, 5}, {2, 4, -14, 3}, {-5, 7, 8, 5}};
        task3(arr4);
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[0].length; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
