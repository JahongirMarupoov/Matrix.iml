package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix52 {
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
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] < min) {
                    minIndex = i;
                    min = matrix[j][i];
                }
                if (matrix[j][i] > max) {
                    maxIndex = i;
                    max = matrix[j][i];
                }
            }
        }
        int[] temp = new int[m];
        for (int i = 0; i < n; i++) {
            if (i == maxIndex) {
                for (int j = 0; j < matrix.length; j++) {
                    temp[j] = matrix[j][i];
                    matrix[j][i] = matrix[j][minIndex];
                    matrix[j][minIndex] = temp[j];
                }
                break;
            } else if (i == minIndex) {
                for (int j = 0; j < matrix.length; j++) {
                    temp[j] = matrix[j][i];
                    matrix[j][i] = matrix[j][maxIndex];
                    matrix[j][maxIndex] = temp[j];
                }
                break;
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}