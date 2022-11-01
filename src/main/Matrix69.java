package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 4, n = 6, k = 3;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 9);
            }
        }
        MatrixHelper.show(matrix);
        int[][] newMatrix = new int[m][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m; j++) {
                if (i < k) newMatrix[i][j] = matrix[i][j];
                else if (i == k) newMatrix[i][j] = 0;
                else if (i > k) newMatrix[i][j] = matrix[i - 1][j];
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(newMatrix);
    }
}
