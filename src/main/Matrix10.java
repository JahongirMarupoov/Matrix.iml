package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int lenght;
        lenght = m / 2;
        int[][] kMatrix = new int[lenght][n];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 50);
                if (i % 2 == 1) kMatrix[index][j] = matrix[i][j];
            }
            if (i % 2 == 1) index++;
        }
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println("Result: ");
        for (int[] row : kMatrix) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }
}
