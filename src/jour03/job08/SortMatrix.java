package jour03.job08;

import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{5, 9, 3}, {7, 2, 8}, {1, 6, 4}};

        System.out.println("Matrix before sorting: " + Arrays.deepToString(matrix));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = j + 1; k < matrix[i].length; k++) {
                    if (matrix[i][k] < matrix[i][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
        System.out.println("Matrix after sorting: " + Arrays.deepToString(matrix));

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = j + 1; k < matrix.length; k++) {
                    for (int l = 0; l < matrix.length; l++) {
                        if (matrix[k][l] < matrix[i][j]) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }
        /*
         * 00 10 11 12
         *
         * */
        System.out.println("Matrix after sorting: " + Arrays.deepToString(matrix));
    }
}
