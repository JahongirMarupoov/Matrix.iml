package main;

public class Matrix81 {

    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixHelper.generate(n, n);

        int sum = mainDiagonalSum(matrix);
        System.out.println("MAIN DIAGONAL SUM = " + sum);
        sum = helperDiagonalSum(matrix);
        System.out.println("HELPER DIAGONAL SUM = " + sum);
    }

    /**
     * Asosiy diagonal [0][0] ... [n][n]
     *
     * @param matrix kvadrat matrix
     * @return sum - asosiy diagonal yig'indisi
     */
    public static int mainDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
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
