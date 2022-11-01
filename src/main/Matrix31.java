package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 3, n = 4;
        int[][] matrix = new int[m][n];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 30);
                System.out.printf("%d\t", matrix[i][j]);
                sum += matrix[i][j];
            }
            System.out.println();
        }
        int ortaArifmetik = sum / m / n;
        int min = Integer.MAX_VALUE, indexI = 0, indexJ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (Math.abs(matrix[i][j] - ortaArifmetik) < min) {
                    min = Math.abs(matrix[i][j] - ortaArifmetik);
                    indexJ = j;
                    indexI = i;
                }
            }
        }
        System.out.println("Index of 'i' = " + indexI);
        System.out.print("Index of 'j' = " + indexJ);
    }
}