package examples1;

import java.util.Arrays;

public class Example40 {

    public static void main(String[] args) {
        int m = 5, n = 8;
        int[][] matrix = MatrixHelper.generate(m, n);
        System.out.println("Natija: ");
        int[] array = solution(matrix);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    /**
     * 1. Har bir qator o'sish tartibida saralanadi  1 1 1 1 1 2 2 2 2 3 3 3 3 3 ...
     * 2. Saralangan massivda eng ko'p takrorlangan elementlar soni aniqlanadi
     * 3. Eng ko'p takrorlangan element mavjud bo'lgan qator topiladi
     */

    public static int[] solution(int[][] matrix) {
        // berilgan matrix qiymatlari o'zgarib ketmasligi uchun
        // tempga nusxalab oldik
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp[i][j] = matrix[i][j];
            }
        }
        int duplicateCountMax = Integer.MIN_VALUE;
        int index = 0; // bir xil elementlar eng ko'p qatnashgan satr indexi
        for (int i = 0; i < temp.length; i++) {
            // 1 2 1 1 1 2 2 5 4 3 4 3 3 2 1 1 1 2 2 1 1 1 1  -> 11
            int[] sortedArray = selectionSort(temp[i]);
            int count = maxDuplicateCount(sortedArray);
            if (duplicateCountMax <= count) {
                duplicateCountMax = count;
                index = i;
            }
        }
        System.out.println("Index: " + index);
        return matrix[index];
    }


    /**
     * massivda eng ko'p qatnashgan element sonini qaytaradi
     *
     * @param array saralangan massiv
     * @return int[]
     */
    // 1 1 1 1 1 1 1 2 2 2 2
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

    /* Selection sort algoritmidan foydalanamiz    **/
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
}