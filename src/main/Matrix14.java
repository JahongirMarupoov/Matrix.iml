package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix14 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("m = ");
        int m = scanner.nextInt();
        int[][] matrix = new int[m][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 50);
            }
        }
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println("Result: ");
        solution(matrix);
    }

    public static void solution(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            for (int j = i + 1; j < m; j++) {
                System.out.print(matrix[m - 1 - i][j] + "\t");
            }
            System.out.println();
        }
    }
}
