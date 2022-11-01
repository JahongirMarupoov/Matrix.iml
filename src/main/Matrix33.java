package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 6, n = 6;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(-30, 30);
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            int index1 = 0, index2 = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] < 0) index1++;
                if (matrix[j][i] > 0) index2++;
            }
            if (index1 == index2) index = i;
        }
        System.out.print("Satr index : " + index);
    }
}