package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 10, n = 15;
        int[][] matrix = new int[m][n];
        MatrixHelper.generate(1, 2);
        MatrixHelper.show(matrix);
        boolean max = true, min = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }
        }
    }

    public static int isMax(int[] array) {
        int max = Integer.MIN_VALUE;
        if (array.length == 1) return array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int isMin(int[] array) {
        int min = Integer.MAX_VALUE;
        if (array.length == 1) return array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
