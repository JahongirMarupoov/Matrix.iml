package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 3, n = 4;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 30);
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += matrix[j][i];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][index] < min) min = matrix[i][index];
        }
        System.out.println(index);
        System.out.println("Solution : " + min);
    }
}
