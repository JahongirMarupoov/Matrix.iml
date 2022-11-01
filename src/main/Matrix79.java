package main;

public class Matrix79 {

    public static void main(String[] args) {
        int[][] matrix = MatrixHelper.generate(10, 10);
        System.out.println("Result:");
        matrix = solution(matrix);
        MatrixHelper.show(matrix);
    }

    public static int[][] solution(int[][] matrix) {
        int[][] t = new int[matrix.length][2];
        // t[i][0] = matrix ning i-indexini
        // t[i][1] = matrix ning i-indexdagi minimal qiymatni saqlaymiz

        // matrixning i-satridagi minimal elementini topamiz
        for (int i = 0; i < matrix.length; i++) {
            t[i][0] = i;
            int min = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (min < matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
            t[i][1] = min;
        }

        System.out.println("After sorting");
        sorting(t);
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            temp[i] = matrix[t[i][0]];
        }
        matrix = temp;

        return matrix;
    }

    // matrixning 1-ustuni kamayish tartibida saralansin
    public static void sorting(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (matrix[j][1] < matrix[j + 1][1]) {
                    int[] temp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }
    }

/*
            1	3
            3	3
            4	3
            6	3
            9	3
            2	1
            0	0
            5	0
            7	0
            8	0

*/

}
