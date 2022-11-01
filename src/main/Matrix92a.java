package main;

public class Matrix92a {

    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixHelper.generate(n, n);
        System.out.println("Result :");
        MatrixHelper.show(mainDiagonalParallel(matrix));
    }

    public static int[][] mainDiagonalParallel(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    public static int helperDiagonalSum(int[][] matrix) {
        int sum = 0;
        int lastRowIndex = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[lastRowIndex - i][i];
        }

        return sum;
    }
}
