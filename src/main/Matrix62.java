package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 4, n = 4, k = 2;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 9);
            }
        }
        MatrixHelper.show(matrix);
        System.out.println("Result :");
        MatrixHelper.show(solution(matrix,m,m,k));
    }

    public static int[][] solution(int[][] matrix, int m, int n, int k) {
        int[][] newMatrix = new int[m - 1][n];
        int mIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i != k) {
                for (int j = 0; j < matrix[i].length; j++) {
                    newMatrix[mIndex][j] = matrix[i][j];
                }
                mIndex++;
            }
        }
        return newMatrix;
    }
}