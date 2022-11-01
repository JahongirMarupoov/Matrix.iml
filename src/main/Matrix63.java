package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 4, n = 4;
        int[][] matrix = new int[m][n];
        int min = Integer.MAX_VALUE, minIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 9);
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = i;
                }
            }
        }
        MatrixHelper.show(matrix);
        System.out.println("Result :");
        MatrixHelper.show(solution(matrix, m, n, minIndex));
    }

    public static int[][] solution(int[][] matrix, int m, int n, int minIndex) {
        int[][] newMatrix = new int[m-1][n];
        int mIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i != minIndex) {
                for (int j = 0; j < matrix[i].length; j++) {
                    newMatrix[mIndex][j] = matrix[i][j];
                }
                mIndex++;
            }
        }
        return newMatrix;
    }
}