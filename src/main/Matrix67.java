package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 4, n = 10;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(-3, 9);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] >= 0) counter++;
            }
            if (counter == m) {
                count++;
            }
        }
        int[] array = new int[count];
        int arrayIndex = 0;
        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] >= 0) counter++;
            }
            if (counter == m) {
                array[arrayIndex++] = i;
            }
        }
        MatrixHelper.show(matrix);
        System.out.println("Result :");
        MatrixHelper.show(solution(matrix, m, n, array, count));
    }

    public static int[][] solution(int[][] matrix, int m, int n, int[] array, int count) {
        int[][] newMatrix = new int[m][n-count];
        int mIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i != array[mIndex]) {
                for (int j = 0; j < matrix.length; j++) {
                    newMatrix[j][mIndex] = matrix[j][i];
                }
                mIndex++;
            }
        }
        return newMatrix;
    }
}