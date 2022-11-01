package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 4, n = 4;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 9);
            }
        }
        MatrixHelper.show(matrix);
        for (int i = 0; i < n / 2; i++) {
            int[] temp = new int[m];
            for (int j = 0; j < matrix.length; j++) {
                temp[j] = matrix[j][i];
                matrix[j][i] = matrix[j][n - 1 - i];
            }
            int index = 0;
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][n-1-i] = temp[index++];
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}