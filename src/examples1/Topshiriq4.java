package examples1;

import java.util.*;

public class Topshiriq4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-20, 20);
            System.out.printf("%d\t",array[i]);
        }
        System.out.println();
        insertionSort(array);
        System.out.println("Result:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);
        }
    }

    public static int[] insertionSort(int[] array) {
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