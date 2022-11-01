package main;

public class Matrix44 {

    public static void main(String[] args) {
        int m = 25, n = 30;
        int[][] matrix = MatrixHelper.generate(m, n);

        Matrix40.selectionSort(matrix[3]);
        Matrix40.selectionSort(matrix[6]);
        Matrix40.selectionSort(matrix[19]);

        System.out.println("Berilgan matrix: ");
        MatrixHelper.show(matrix);
        System.out.println("Natija: ");
        int result = solution(matrix);
        System.out.println(result);
    }

    /**
     * 1. Har i-satr saralanganlikka tekshiriladi
     * 2. Agar i-satr saralangan bo'lsa, min element topilad va avvalgisi bilan taqqoslanib
     * eng kichigi olinadi
     * 3. Agar saralangan satr aniqlanmasa, 0 qaytarilad
     * aks holda topilgan eng kichik elelemt qaytariladi
     */

    public static int solution(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (isAscSorted(matrix[i]) || isDescSorted(matrix[i])) {
                int minElement = minElement(matrix[i]);
                if (min > minElement)
                    min = minElement;
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

    /***
     * Berilgan massivdan eng kichik qiymatni aniqlaydi
     * @param array saralangan massiv
     * @return min qiymat
     */
    public static int minElement(int[] array) {
        if (array.length == 0) return 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    // O'sish tartibida saralangan
    // 4 4 3 3 2 1
    public static boolean isAscSorted(int[] array) {
        if (array.length <= 1) return true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) return false;
        }
        return true; // saralangan
    }

    // Kamayish tartibida saralangan
    // 4 4 3 3 2 1
    public static boolean isDescSorted(int[] array) {
        if (array.length <= 1) return true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) return false;
        }
        return true; // saralangan
    }

}
