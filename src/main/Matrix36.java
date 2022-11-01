package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix36 {
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
            System.out.println();
        }
        int index = 0;
        for (int i = 1; i < m; i++) {
            int index1 = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == matrix[0][j]) {
                    index1++;
                }
            }
            if (index1 == n) index++;
        }
        if (index > 0) System.out.print("Solution : " + (index));
        else System.out.println("Not found!");
    }
}