package Trash;

import java.util.Arrays;

public class hw3 {
    public static void main(String[] args) {

        int[][] matrix = {
                {2, 4, 3, 3},
                {5, 7, 8, 5},
                {2, 4, 3, 3},
                {5, 7, 8, 5}
        };

//        int[][] matrix = new int[10][10];

//                 {
//                     {2, 1, 1, 1},
//                     {0, 7, 1, 1},
//                     {0, 0, 3, 1},
//                     {0, 0, 0, 5}
//                 }

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j) {
                    if (j > i) matrix[i][j] = 1;
                    else if (j < i) matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


//    Копіювання массива
//    Arrays.copyOf()
//    System.arraycopy()

}
