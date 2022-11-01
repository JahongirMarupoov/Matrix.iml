package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 6, n = 5;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 9);
            }
        }
        MatrixHelper.show(matrix);
        for (int i = 0; i < matrix.length / 2; i++) {
            int[] temp = new int[n];
            for (int j = 0; j < matrix[i].length; j++) {
                temp[j] = matrix[i][j];
                matrix[i][j] = matrix[m / 2 + i][j];
            }
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[m / 2 + i][j] = temp[j];
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}