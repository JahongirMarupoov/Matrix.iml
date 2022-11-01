package main;

import java.util.Random;

public class Matrix75 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 10, n = 6;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 9);
            }
        }
        MatrixHelper.show(matrix);
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (matrix[i][j] > matrix[i][j - 1] && matrix[i][j] > matrix[i][j + 1]) {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}
