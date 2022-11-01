package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 5, n = 6;
        System.out.print("k = ");
        int k = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 30);
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0, kopaytma = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i == k) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                    kopaytma *= matrix[i][j];
                }
            }
        }
        System.out.println("Yig'indisi : " + sum);
        System.out.println("Ko'paytmasi : " + kopaytma);
    }
}
