package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 10, n = 15;
        System.out.print("k1 = ");
        int k1 = scanner.nextInt();
        System.out.print("k2 = ");
        int k2 = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 20);
            }
        }
        MatrixHelper.show(matrix);
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {

            if (i == k1) {
                for (int j = 0; j < matrix.length; j++) {
                    temp[j] = matrix[j][i];
                    matrix[j][i] = matrix[j][k2];
                }
            }
            if (i == k2) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = temp[j];
                }
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}
