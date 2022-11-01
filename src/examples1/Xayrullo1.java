package examples1;

import java.util.Random;
import java.util.Scanner;

public class Xayrullo1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10);
            System.out.print(array[i] + "\t");
        }

        System.out.println();
        System.out.print(array[0] + "\t");
        for (int i = 1; i < array.length - 1; i++) {
            int temp = array[i];
            array[i] = array[i - 1] + array[i] + array[i + 1];
            System.out.print(array[i] + "\t");
            array[i] = temp;
        }
        System.out.print(array[array.length - 1]);
    }
}
