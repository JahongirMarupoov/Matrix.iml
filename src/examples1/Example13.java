package examples1;

import java.util.Random;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.print("m = ");
        m = scanner.nextInt();

        int[][] matrix = new int[m][m];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(0, 100);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        solution(matrix);

    }

    // 0<= k < m
    public static void solution(int[][] matrix) {
        System.out.println("Natija: ");
        int m = matrix.length;
        for (int i = 0; i < m; i++) {
            // i matrixning satri
            // i-satrning qolgan elementlari chop etiladi
            for (int j = 0; j < m - i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            // m-1-i - ustunning qolgan elementlari
            for (int j = i + 1; j < m; j++) {
                System.out.print(matrix[j][m - i - 1] + " ");
            }

            System.out.println();
        }
    }
}
