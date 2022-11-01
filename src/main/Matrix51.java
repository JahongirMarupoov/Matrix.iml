package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix51 {
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    minIndex = i;
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    maxIndex = i;
                    max = matrix[i][j];
                }
            }
        }
        int[] temp = new int[n];
        for (int i = 0; i < matrix.length; i++) {
            if (i == maxIndex) {
                for (int j = 0; j < matrix[i].length; j++) {
                    temp[j] = matrix[i][j];
                    matrix[i][j] = matrix[minIndex][j];
                    matrix[minIndex][j] = temp[j];
                }
                break;
            } else if (i == minIndex) {
                for (int j = 0; j < matrix[i].length; j++) {
                    temp[j] = matrix[i][j];
                    matrix[i][j] = matrix[maxIndex][j];
                    matrix[maxIndex][j] = temp[j];
                }
                break;
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}