package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 5, n = 5;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 20);
            }
        }
        MatrixHelper.show(matrix);
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            int minIndex = 0, maxIndex = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] < min) {
                    minIndex = j;
                    min = matrix[j][i];
                }
                if (matrix[j][i] > max) {
                    maxIndex = j;
                    max = matrix[j][i];
                }
            }
            int temp = matrix[maxIndex][i];
            matrix[maxIndex][i] = matrix[minIndex][i];
            matrix[minIndex][i] = temp;
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}