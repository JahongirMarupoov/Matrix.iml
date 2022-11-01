package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 4, n = 10;
        int[][] matrix = new int[m][n];
        int Index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(-4, 9);
            }
        }
        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] >= 0) counter++;
            }
            if (counter == m) {
                Index = i;
                break;
            }
        }
        MatrixHelper.show(matrix);
        System.out.println("Result :");
        MatrixHelper.show(solution(matrix, m, n, Index));
    }

    public static int[][] solution(int[][] matrix, int m, int n, int Index) {
        int[][] newMatrix = new int[m][n - 1];
        int mIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i != Index) {
                for (int j = 0; j < matrix.length; j++) {
                    newMatrix[j][mIndex] = matrix[j][i];
                }
                mIndex++;
            }
        }
        return newMatrix;
    }
}