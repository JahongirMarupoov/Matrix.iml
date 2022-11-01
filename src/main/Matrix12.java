package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix12 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int[][] kmatrix = new int[m][n];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 50);
            }
        }
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    kmatrix[j][i] = matrix[j][i];
                }
            } else {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    kmatrix[index++][i] = matrix[j][i];
                }
                index = 0;
            }
        }
        System.out.println("Result: ");
        for (int[] row : kmatrix) {
            for (int temp : row) {
                System.out.print(temp + "\t");
            }
            System.out.println();
        }
    }
}
