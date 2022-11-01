package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 2, n = 6;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(-3, 30);
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
        int index = 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int index1 = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] % 2 == 1) {
                    index1++;
                }
            }
            if (index1 == m) {
                counter++;
                index = i;
            }
            if (counter == 1) break;
        }
        if (index > 0) System.out.print("Ustun index : " + (index));
        else System.out.println("Not found!");
    }
}