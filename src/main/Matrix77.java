package main;


public class Matrix77 {

    public static void main(String[] args) {
        int[][] matrix = MatrixHelper.generate(4, 5);
        solution(matrix);
        System.out.println("Result: ");
        MatrixHelper.show(matrix);
    }

    // matrixning 0-ustuni o'sish tartibida saralansin
    public static void solution(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (matrix[0][j] > matrix[0][j + 1]) {
                    int[] temp = matrix[i];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }
    }
}
