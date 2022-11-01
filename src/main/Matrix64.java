package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 4, n = 4;
        int[][] matrix = new int[m][n];
        int max = Integer.MIN_VALUE, maxIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 9);
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxIndex = j;
                }
            }
        }
        MatrixHelper.show(matrix);
        System.out.println("Result :");
        MatrixHelper.show(solution(matrix, m, n, maxIndex));
    }

    public static int[][] solution(int[][] matrix, int m, int n, int maxIndex) {
        int[][] newMatrix = new int[m][n - 1];
        int mIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i != maxIndex) {
                for (int j = 0; j < matrix.length; j++) {
                    newMatrix[j][mIndex] = matrix[j][i];
                }
                mIndex++;
            }
        }
        return newMatrix;
    }
}