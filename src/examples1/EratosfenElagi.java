package examples1;

public class EratosfenElagi {
    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        for (int i = 2; i * i <= n; i++) {
            for (int j = i * i; j < n; j += i) {
                a[j] = 0;
            }
        }
        System.out.println();
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 || a[i] == 1) counter++;
        }
        int[] newArray = new int[counter];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 || a[i] == 1) {
                continue;
            }
            newArray[index] = a[i];
            System.out.printf("%d\t", newArray[index]);
            index++;
        }
    }
}
