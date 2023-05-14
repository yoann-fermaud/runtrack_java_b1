package jour03.job07;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        // First way
        System.out.println("Matrix 1:");
        for (int[] element : matrix1) {
            System.out.println(Arrays.toString(element));
        }
        // Second way
        System.out.println("Matrix 1: " + Arrays.deepToString(matrix1));
        System.out.println("Matrix 2: " + Arrays.deepToString(matrix2));

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] += matrix2[i][j];
            }
        }
        System.out.println("Matrix 1 + Matrix 2: " + Arrays.deepToString(matrix1));
    }
}
