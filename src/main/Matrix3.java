package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int[] mArray = new int[m];
        for (int i = 0; i < mArray.length; i++) {
            mArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = mArray[i];
            }

        }

        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}
