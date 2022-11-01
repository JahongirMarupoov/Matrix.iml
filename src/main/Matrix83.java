package main;

public class Matrix83 {

    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixHelper.generate(n, n);
        System.out.println("Result :");
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0, index = 0;
            for (int j = i; j < matrix.length; j++) {
                sum += matrix[index++][j];
            }
            System.out.println(sum);
        }
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
