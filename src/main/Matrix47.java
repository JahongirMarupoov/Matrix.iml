package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix47 {
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
        for (int i = 0; i < matrix.length; i++) {

            if (i == k1) {
                for (int j = 0; j < matrix[i].length; j++) {
                    temp[j] = matrix[i][j];
                    matrix[i][j] = matrix[k2][j];
                }
            }
            if (i == k2) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = temp[j];
                }
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}
