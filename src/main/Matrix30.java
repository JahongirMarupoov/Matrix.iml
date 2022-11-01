package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix30 {
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
                sum+=matrix[i][j];
            }
            System.out.println();
        }
        int ortaArifmetik=sum/m/n;
        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[j][i]>ortaArifmetik)counter++;
            }
            System.out.println(counter);
        }
    }
}
