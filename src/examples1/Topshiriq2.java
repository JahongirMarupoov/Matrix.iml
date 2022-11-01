package examples1;

public class Topshiriq2 {
    public static void main(String[] args) {

        String satr = "Mar'ufov Jahongirbek Shavkatjon o'g'li.";
        System.out.println("Input: " + satr);
        char c = 'a';
        System.out.println("C: " + c);

        char[] array = satr.toCharArray();

        System.out.print("Output: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (array[i] == c) {
                System.out.print(array[i]);
            }
        }
    }
}
