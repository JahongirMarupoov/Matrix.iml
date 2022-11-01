package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 3, n = 6;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
//                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
        int index = 0;
        for (int i = 0; i < n-1; i++) {
            int index1 = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] == matrix[j][n - 1]) {
                    index1++;
                }
            }
            if (index1 == m) index++;
        }
        if (index > 0) System.out.print("Solution : " + (index));
        else System.out.println("Not found!");
    }
}