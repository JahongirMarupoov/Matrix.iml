package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 5, n = 5;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(-30, 5);
            }
        }
        MatrixHelper.show(matrix);
        int minIndex = n - 1, Index = 0;
        for (int i = 0; i < n - 1; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] < 0) counter++;
            }
            if (counter == m) {
                Index = i;
                break;
            }
        }
        int[] temp = new int[m];
        for (int i = 0; i < n; i++) {
            if (i == Index) {
                for (int j = 0; j < matrix.length; j++) {
                    temp[j] = matrix[j][i];
                    matrix[j][i] = matrix[j][minIndex];
                    matrix[j][minIndex] = temp[j];
                }
                break;
            } else if (i == minIndex) {
                for (int j = 0; j < matrix.length; j++) {
                    temp[j] = matrix[j][i];
                    matrix[j][i] = matrix[j][Index];
                    matrix[j][Index] = temp[j];
                }
                break;
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}