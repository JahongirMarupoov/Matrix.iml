package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix21 {
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
        int counter = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < m; j++) {
                    sum += matrix[j][i];
                    counter++;
                }
            }
        }
        System.out.println("O'rta arifmetik : " + sum / counter);
        System.out.println(counter);
    }
}
