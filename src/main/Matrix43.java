package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 2, n = 6;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 5);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int isBigCount = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int counter = 0;
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[j][i] <= matrix[j - 1][i]) {
                    counter++;
                } else break;
            }
            if (counter == m - 1) {
                isBigCount++;
            }
        }
        System.out.println(isBigCount);
    }
}

