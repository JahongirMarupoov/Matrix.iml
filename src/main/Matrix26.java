package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 6, n = 8;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 30);
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int sum = 1;
            for (int j = 0; j < m; j++) {
                sum *= matrix[j][i];
            }
            if (sum < min) {
                min = sum;
                index = i;
            }
        }
        System.out.println("Solution : " + min);
        System.out.print("Index : " + index);
    }
}
