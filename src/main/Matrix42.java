package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 4, n = 6;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int isBigCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] >= matrix[i][j - 1]) {
                    counter++;
                } else break;
            }
            if (counter == n - 1) {
                isBigCount++;
            }
        }
        System.out.println(isBigCount);
    }
}

