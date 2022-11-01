package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 6, n = 6;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(-3, 30);
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
        int index = 0;
        for (int i = 0; i < m; i++) {
            int index1 = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0) {
                    index1++;
                }
            }
            if (index1 == n) index = i;
        }
        if (index > 0) System.out.print("Satr index : " + (index));
        else System.out.println("Not found!");
    }
}