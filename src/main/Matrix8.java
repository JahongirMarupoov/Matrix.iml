package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("k = ");
        int k = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int[] kArray = new int[m];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 50);
                if (j == k) kArray[index++] = matrix[i][j];
            }
        }
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println("k chi indexdagi satr:");
        for (int i = 0; i < kArray.length; i++) {
            System.out.printf("%d  ", kArray[i]);
        }
    }
}
