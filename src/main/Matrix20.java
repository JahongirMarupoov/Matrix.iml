package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 5, n = 6;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 30);
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int kopaytma = 1;
            for (int j = 0; j < m; j++) {
                kopaytma *= matrix[j][i];
            }
            System.out.println(i + " chi ustun elementlari ko'paytmasi : " + kopaytma);
        }
    }
}
