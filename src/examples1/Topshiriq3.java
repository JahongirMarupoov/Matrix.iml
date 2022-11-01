package examples1;

import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public class Topshiriq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("N = ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        for (int i = 2; i * i <= n; i++) {
            for (int j = i * i; j < n; j += i) {
                a[j] = 0;
            }
        }
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 || a[i] == 1) counter++;
        }
        int[] newArray = new int[a.length - counter];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 || a[i] == 1) {
                continue;
            }
            newArray[index] = a[i];
            System.out.printf("%d\t", newArray[index]);
            index++;
        }
        System.out.println();

        System.out.print("WhatFind = ");
        int WhatFind = scanner.nextInt();

        int x = 0;//Qidirilayotgan element solishtiriladigan joriy indeks
        int c = 0;//Qididirish sohasi chap chegarasi
        int b = a.length - counter - 1;//qidirish sohasi o'ng chegrasi
        boolean found;
        for (found = false; (newArray[c] < WhatFind) && (newArray[b] > WhatFind) && !found; ) {
            //Interpolyatsiyani hisoblash
            x = c + ((WhatFind - newArray[c]) * (b - c)) / (newArray[b] - newArray[c]);
            //agar element topilmasa yangi soha chegaralari belgilanadi
            if (newArray[x] < WhatFind) c = x + 1;
            else if (newArray[x] > WhatFind) b = x - 1;
            else found = true;
        }
        if (newArray[c] == WhatFind) System.out.println("Founded element index : " + c);
        else if (newArray[b] == WhatFind) System.out.println("Founded element index : " + b);
        else System.out.println("Not found!");
    }
}