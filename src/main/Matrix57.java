package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix57 {
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
        for (int i = 0; i < matrix.length / 2; i++) {
            int[] temp = new int[n/2];
            for (int j = 0; j < matrix[i].length/2; j++) {
                temp[j] = matrix[i][j];
                matrix[i][j] = matrix[m / 2 + i][j+n/2];
            }
            int index=0;
            for (int j = matrix[i].length/2; j < matrix[i].length; j++) {
                matrix[m / 2 + i][j] = temp[index++];
            }
        }
        System.out.println("Result :");
        MatrixHelper.show(matrix);
    }
}