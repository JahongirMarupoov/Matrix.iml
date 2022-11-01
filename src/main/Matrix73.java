package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 10, n = 6, min = Integer.MAX_VALUE, musbatIn = 0;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            int k=0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(-9, 3);
                if (matrix[i][j] < 0) {
                    k++;
                }
                if (k == n) musbatIn = i;
            }
        }
        MatrixHelper.show(matrix);
        int[][] newMatrix = new int[m + 1][n];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= musbatIn) newMatrix[i][j] = matrix[i][j];
                else if (i == musbatIn + 1) newMatrix[i][j] = 0;
                else newMatrix[i][j] = matrix[i - 1][j];
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(newMatrix);
    }
}
