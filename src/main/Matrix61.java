package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 4, n = 4, k = 2;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 9);
            }
        }
        MatrixHelper.show(matrix);
        System.out.println("Result :");
        for (int i = 0; i < matrix.length; i++) {
            if (i != k) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%d\t", matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}