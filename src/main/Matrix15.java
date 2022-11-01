package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix15 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
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
        MatrixHelper.show(matrix);
    }

    public static void solution(int[][] matrix) {
        Random random = new Random();
        int m = matrix.length;
        int[] mArray = new int[m * m];
        int d = 1;
        for (int i = 0; i < mArray.length; i++) {
            mArray[i] = d++;
        }
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m - i; j++) {
                matrix[i][j] = mArray[index++];
            }
            for (int j = i + 1; j < m - i; j++) {
                matrix[j][m - 1 - i] = mArray[index++];
            }
            for (int j = m - 2 - i; j >= i; j--) {
                matrix[m-i-1][i] = mArray[index++];
            }
           for (int j = 0; j <5; j++) {
               matrix[j][i] = mArray[index++];
           }
        }
    }
}
