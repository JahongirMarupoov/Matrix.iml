package examples1;

import java.util.Random;
import java.util.Scanner;

public class Topshiriq1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("N: ");
        int n = scanner.nextInt();


        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int sum = 0;
        int kopaytma = 1;


        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(-10, 10);
            if (array1[i] > 0) {
                sum += array1[i];
            } else if (array1[i] < 0) {
                kopaytma *= array1[i];
            }
            array2[i] = random.nextInt(-10, 10);
            if (array2[i] > 0) {
                sum += array2[i];
            } else if (array2[i] < 0) {
                kopaytma *= array2[i];
            }
        }


        System.out.println("1 - massiv:");
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("%d\t", array1[i]);
        }
        System.out.println();
        System.out.println("2 - massiv:");
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("%d\t", array2[i]);
        }


        System.out.println();
        System.out.println("Yig'indi = " + sum);
        System.out.print("Ko'paytma = " + kopaytma);


    }
}
