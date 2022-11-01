package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 6, n = 8;
        int[][] matrix = new int[m][n];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 5);
                System.out.printf("%d\t", matrix[i][j]);
                sum += matrix[i][j];
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < m - 1; j++) {
                if (matrix[j][i] == matrix[j + 1][i]) counter++;
                if (matrix[j][i] != matrix[j + 1][i]) counter = 0;
            }
            if (counter > max) {
                index = i;
                max = counter;
            }
        }
        if (max > 0) System.out.println("Solution index : " + index);
        else System.out.println("ERROR!");
    }
}
