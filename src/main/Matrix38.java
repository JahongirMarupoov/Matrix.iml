package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 6, n = 3;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
//                System.out.printf("%d\t", matrix[i][j]);
            }
            //System.out.println();
        }
        int index = 0;
        for (int i = 0; i < m; i++) {
            int index1 = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (matrix[i][j] == matrix[k][j]) {
                        index1++;
                    }
                }
            }
            if (index1 == n) index++;
        }
        System.out.print("Solution : " + (m - 2 - index));
    }
}