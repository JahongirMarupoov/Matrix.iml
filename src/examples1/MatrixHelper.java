package examples1;

import java.util.Random;

public class MatrixHelper {

    public static int[][] generate(int m, int n) {
        int[][] matrix = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10) + 1; //[1..10]
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void show(int[][] matrix) {
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
