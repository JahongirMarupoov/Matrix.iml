package main;


public class Matrix76 {

    public static void main(String[] args) {
        int[][] matrix = MatrixHelper.generate(10, 10);
        solution(matrix);
        System.out.println("Result: ");
        MatrixHelper.show(matrix);
    }

    // matrixning 0-ustuni o'sish tartibida saralansin
    public static void solution(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (matrix[j][0] > matrix[j + 1][0]) {
                    int[] temp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }
    }
}
