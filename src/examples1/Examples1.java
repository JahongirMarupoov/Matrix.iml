package examples1;

import java.util.Scanner;

public class Examples1 {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("(ROW) m = ");
        m = scanner.nextInt();
        System.out.print("(COL) n = ");
        n = scanner.nextInt();
        // Matrix e'lon qilish
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * 10;
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
