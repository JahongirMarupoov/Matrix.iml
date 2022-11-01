package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix49 {
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
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            int minIndex = 0, maxIndex = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    minIndex = j;
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    maxIndex = j;
                    max = matrix[i][j];
                }
            }
            int temp = matrix[i][maxIndex];
            matrix[i][maxIndex] = matrix[i][minIndex];
            matrix[i][minIndex] = temp;
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}