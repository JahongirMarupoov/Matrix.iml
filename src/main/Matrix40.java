package main;

import java.util.Random;
import java.util.Scanner;

public class Matrix40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = 6, n = 8;
        int[][] matrix = new int[m][n];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 5);
                System.out.printf("%d\t", matrix[i][j]);
                sum += matrix[i][j];
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < m; i++) {
            int counter = 0;
            for (int j = 0; j < n - 1; j++) {
                if (matrix[i][j] == matrix[i][j + 1]) counter++;
            }
            if (counter >= max) {
                index = i;
                max = counter;
            }
        }
        if (max > 0) System.out.println("Solution index : " + index);
        else System.out.println("ERROR!");
    }
    public static int[] selectionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int k = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > k)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = k;
        }
        return array;
    }
    public static int maxDuplicateCount(int[] array) {
        int maxCount = 0;
        int count = 1; // uchragan element hozircha bitta uchradi
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1])
                count++; // yana avvalgisiga teng bo'lgan element uchradi
            else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 1;
            }
        }
        return maxCount;
    }
}
